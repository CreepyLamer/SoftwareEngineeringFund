package control;

public class Location {
 
	private String roomID;
	private String roomLocation;
	private boolean aviliable;
	
	public Location(String roomID,String roomLocation) 
	{
		this.roomID = roomID;
		this.roomLocation = roomLocation;
	}
	
	public String getRoomID()
	{
		return roomID;
	}
	
	public String getRoomLocation()
	{
		return roomLocation;
	}
	


	
	//view location
	public void viewLocation()
	{
	    	System.out.printf("Room ID : %s. Location : %s\n",getRoomID(),getRoomLocation());			    
	}

}
