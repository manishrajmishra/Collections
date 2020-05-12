package immutableclass;

import java.util.HashMap;
import java.util.Map;

public class Location {
	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationID, String description, Map<String, Integer> exits) {
		this.locationID = locationID;
		this.description = description;
//		this.exits = new HashMap<String, Integer>();
//		this males the class "immutable class" which means once instance is created cannot be changed
		if(exits != null) {
		this.exits = new HashMap<String, Integer>(exits); 
		}else {
			this.exits = new HashMap<String, Integer>();
		}
		this.exits.put("Q", 0);
	}
	
//	public void addExits(String direction, int location) {
//		exits.put(direction, location);
//	}
	
	public int getLocationID() {
		return locationID;
	}
	
	public String getdescription() {
		return description;
	}
	
	public Map<String, Integer> getExits(){
//		return exits;
		return new HashMap<String, Integer>(exits);
	}
}
