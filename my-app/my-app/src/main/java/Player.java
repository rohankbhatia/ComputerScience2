import java.util.HashMap;

public class Player {
	public String firstName;
	public String lastName;
	//public int number;
	public String playerID;
	//public Team team;
	
	public HashMap<Integer, Stats> stats;
	
	public Player(String playerID, String firstName, String lastName/*, int number*/){
		this.playerID = playerID;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.number = number;
		stats = new HashMap<>();
	}
}
