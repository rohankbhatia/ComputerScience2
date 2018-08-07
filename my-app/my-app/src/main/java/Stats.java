
public class Stats {
	public float bat;
	public int rbi;
	int hr;
	int walks;
	int sb;
	int so;
	float cps;
	String color;
	
	public Stats(float bat, int rbi, int hr, int walks, int sb, int so)
	{
		this.bat = bat;	
		this.rbi = rbi;
		this.hr = hr;
		this.walks = walks;
		this.sb = sb;
		this.so = so;
	    cps = ((float)rbi + (float)hr + (float)sb + (float)walks-(float)so)*(float)bat;
	    
	    if(cps >= 10 && cps <= 28){
	    	color = "green";
	    }
	    else if(cps < 10 && cps > 7.5){
	    	color = "yellow";
	    }
	    else if(cps > 28 && cps < 50){
	    	color = "platinum";
	    }
	    else if(cps >= 50){
	    	color = "diamond";
	    }
	    else{
	    	color = "red";
	    }
	}
}
