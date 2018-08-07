import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataIngester {

	public HashMap<String, Player> ingest()
	{
		//File f = new File("Master.csv");
		try {
			Scanner scanner;
			scanner = new Scanner(new File("/Users/Rohan/Desktop/HackMann/Resources/Master.csv"));
	        HashMap<String,Player> players = new HashMap<>();
	        scanner.nextLine();
	        while(scanner.hasNextLine()) {
	            //System.out.print(scanner.next()+"|");
	        	String line = scanner.nextLine();
	        	String[] lineArray = line.split(",");
	        	//System.out.println(lineArray[0]);
	        	players.put(lineArray[0],new Player(lineArray[0], lineArray[13], lineArray[14]));
	        	//System.out.println(lineArray[0]);
	       
	        }
	        scanner.close();
	        //return players;
	        scanner = new Scanner(new File("/Users/Rohan/Desktop/HackMann/Resources/Batting.csv"));
	        scanner.nextLine();
	        while(scanner.hasNextLine()){
	            //System.out.print(scanner.next()+"|");
	        	String line = scanner.nextLine();
	        	String[] lineArray = line.split(",");
	        	//System.out.println(lineArray[0]);
	        	String ID = lineArray[0];
	        	int year = Integer.parseInt(lineArray[1]);
	        	
	        	if(year >= 1920){
		        	int rbi = Integer.parseInt(lineArray[12]);
		        	int bat = Integer.parseInt(lineArray[6]);
		        	int hits = Integer.parseInt(lineArray[8]);
		        	float batAv; 
		        if(bat == 0||hits == 0)
		        {
		        	batAv = 0;
		        }
		        else
		        {
		        	batAv = (float)hits/(float)bat;
		        }
		        //System.out.println(batAv);
		        int hr = Integer.parseInt(lineArray[11]);
		        int walks = Integer.parseInt(lineArray[15]);
		        int sb = Integer.parseInt(lineArray[13]);
		        int so = Integer.parseInt(lineArray[16]);
		        	Stats stats = new Stats(batAv,rbi, hr, walks, sb, so);
		        	Player player = players.get(ID);
		        	//System.out.println(ID);
		        	//System.out.println(year);
		        	player.stats.put(year, stats);
		        	//Stats.put(lineArray[0],new Player(lineArray[0], lineArray[13], lineArray[14]));
	        	}
	        }
	        scanner.close();
	        return players;
	        
		} catch (Exception e) {
			e.printStackTrace();
		    //System.out.println("Caught Exception: " + e.getMessage());
			return null;
		}
	}
}

//