package mapsAdventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
	
	public static void main(String args[]) {
//		Challenge after creating every thing
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.
		
		Scanner scanner = new Scanner(System.in);
		
		 locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
	     locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
	     locations.put(2, new Location(2, "You are at the top of a hill"));
         locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
         locations.put(4, new Location(4, "You are in a valley beside a stream"));
	     locations.put(5, new Location(5, "You are in the forest"));
	     
	     locations.get(1).addExits("W", 2);
	     locations.get(1).addExits("E", 3);
	     locations.get(1).addExits("S", 4);
	     locations.get(1).addExits("N", 5);
//	     locations.get(1).addExits("Q", 0);
	     
	     locations.get(2).addExits("N", 5);
//	     locations.get(2).addExits("Q", 0);
	     
	     locations.get(3).addExits("W", 1);
//	     locations.get(3).addExits("Q", 0);
	     
	     locations.get(4).addExits("N", 1);
	     locations.get(4).addExits("W", 2);
//	     locations.get(4).addExits("Q", 0);
	     
	     locations.get(5).addExits("S", 1);
	     locations.get(5).addExits("W", 2);
//	     locations.get(5).addExits("Q", 0);
	     
	     //Challenge work
	     Map<String, String> vocabulary = new HashMap<String, String>();
	     vocabulary.put("QUIT", "Q");
	     vocabulary.put("NORTH", "N");
	     vocabulary.put("SOUTH", "S");
	     vocabulary.put("WEST", "W");
	     vocabulary.put("EAST", "E");
	     
	     int loc = 1;
	     while(true) {
	    	 System.out.println(locations.get(loc).getdescription());
	    	 if(loc == 0) {
	    		 break;
	    	 }
	    	 
	    	 Map<String, Integer> exits = locations.get(loc).getExits();
	    	 System.out.print("Available exits are ");
	    	 for(String exit: exits.keySet()) {
	    		 System.out.print(exit + ", ");
	    	 }
	    	 System.out.println();
	    	 
	    	 String direction = scanner.nextLine().toUpperCase();
	    	 //challenge work
	    	 if(direction.length() > 1) {
	    		 String[] words = direction.split(" ");
	    		 for(String word : words) {
	    			 if(vocabulary.containsKey(word)) {
	    				 direction = vocabulary.get(word);
	    				 break;
	    			 }
	    		 }
	    	 }
	    	 
	    	 if(exits.containsKey(direction)) {
	    		 loc = exits.get(direction);
	    	 }else {
	    		 System.out.println("You cannot go in that direction");
	    	 }
	     }
	     
//	     String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//	     for(String i : road) {
//	    	 System.out.println(i);
//	     }
//	     
//	     System.out.println("=======================================================================");
//	     
//	     String[] building = "Yoy are insisde a building, a well house for a small spring".split(", ");
//	     for(String i : building) {
//	    	 System.out.println(i);
//	     }
	     scanner.close();
	}
}