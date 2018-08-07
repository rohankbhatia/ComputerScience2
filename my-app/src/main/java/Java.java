import static spark.Spark.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import com.google.gson.Gson; 

public class Java {
    public static void main(String[] args) {
    	//stop();
    	//init();
    	Java j = new Java();
    	//port(9999);
    	staticFileLocation("/");
        get("/", (req, res) -> j.renderContent("searchpage.html"));
        get("/api/players", "application/json", (req, res) -> {
        	res.type("application/json");
        	return j.showPlayers();
        });
        get("/api/search-players/:name", "application/json", (req, res) -> {
        	res.type("application/json");
        	return j.searchPlayers(req.params(":name"));
        });

        get("/api/compare/:player1ID/:player2ID", "application/json", (req, res) -> {
        	res.type("application/json");

        	System.out.println(0);
        	return j.comparePlayers(req.params(":player1ID"), req.params(":player2ID"));
        });
        get("/compare/:player1ID/:player2ID", (req, res) -> {
        	return j.renderContent("comparepage.html");
        });
    }
    private String comparePlayers(String player1ID, String player2ID){
    	Gson gson = new Gson();
    	DataIngester ing = new DataIngester();
    	HashMap<String, Player> players = ing.ingest();
    	System.out.println(1);
    	Player player1 = players.get(player1ID);
    	Player player2 = players.get(player2ID);

    	System.out.println(2);
    	Stats stats1 = player1.stats.get(2012);
    	Stats stats2 = player2.stats.get(2012);
    	
    	if(stats1 == null || stats2 == null){
    		HashMap<String, String> error = new HashMap();
    		error.put("error", "player stats missing from database for said year");
    		return gson.toJson(error);
    	}
    	
    	System.out.println(3);
    	HashMap<String, HashMap<String, String>> payload = new HashMap();
    	HashMap<String, String> payload1 = new HashMap();
    	HashMap<String, String> payload2 = new HashMap();

    	payload1.put("firstName", player1.firstName);
    	payload1.put("lastName", player1.lastName);
    	payload2.put("firstName", player2.firstName);
    	payload2.put("lastName", player2.lastName);
    	
    	payload1.put("hr", String.valueOf(stats1.hr));
    	payload2.put("hr", String.valueOf(stats2.hr));
    	
    	payload1.put("walks", String.valueOf(stats1.walks));
    	payload2.put("walks", String.valueOf(stats2.walks));
    	
    	payload1.put("sb", String.valueOf(stats1.sb));
    	payload2.put("sb", String.valueOf(stats2.sb));
    	
    	payload1.put("so", String.valueOf(stats1.so));
    	payload2.put("so", String.valueOf(stats2.so));
    	
    	payload1.put("color", String.valueOf(stats1.color));
    	payload2.put("color", String.valueOf(stats2.color));
    	
    	payload1.put("cps", String.valueOf(stats1.cps));
    	payload2.put("cps", String.valueOf(stats2.cps));
    	
    	System.out.println(stats1);
    	payload1.put("bat", String.valueOf(stats1.bat));

    	System.out.println(12);
    	payload1.put("rbi", String.valueOf(stats1.rbi));

    	System.out.println(10);
    	payload2.put("bat", String.valueOf(stats2.bat));

    	System.out.println(9);
    	payload2.put("rbi", String.valueOf(stats2.rbi));
    	payload.put(player1ID, payload1);
    	payload.put(player2ID, payload2);
    	System.out.println(payload);
    	return gson.toJson(payload);
    }
    
    private String searchPlayers(String searchTerm)
    {
    	Gson gson = new Gson();
    	DataIngester ing = new DataIngester();
    	
    	
    	HashMap<String, Player> players = ing.ingest();
    	ArrayList<HashMap<String,String>> names = new ArrayList<>();
    	players.forEach((playerID, player) -> {
    		if((player.firstName + " " + player.lastName).toLowerCase().contains(searchTerm.toLowerCase())){
				HashMap<String,String> gang = new HashMap<>();
				gang.put("firstName", player.firstName);
				gang.put("lastName", player.lastName);
				gang.put("playerID", player.playerID);
				names.add(gang);
    		}
    	});
    	return gson.toJson(names);
    }
    
    private String showPlayers()
    {
    	Gson gson = new Gson();
    	DataIngester ing = new DataIngester();
    	HashMap<String, Player> players = ing.ingest();
    	Set<String>playerIDSet = players.keySet();
    	ArrayList<String> playerIDList = new ArrayList<>();
    	playerIDList.addAll(playerIDSet); 
    	return gson.toJson(playerIDList);
    }
    private String renderContent(String htmlFile)
    {
    	try{
    		URL url = getClass().getResource(htmlFile);
    		
    		Path path = Paths.get(url.toURI());
    		return new String(Files.readAllBytes(path), Charset.defaultCharset());
    	} catch (IOException | URISyntaxException e){
    	}
    	return null;
    }
    public ArrayList<String> searchWords(ArrayList<String> words, String searchTerm){
		ArrayList<String> matches = new ArrayList<String>();
		
		for(String word: words){
			if(word.toLowerCase().contains(searchTerm.toLowerCase())){
				matches.add(word);
			}
		}
		return matches;
	}
}
