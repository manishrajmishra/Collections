package maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String args[]) {
		Map<String, String> languages = new HashMap<>();
		
		if(languages.containsKey("Java")) {
			System.out.println("Java already exists");
		}else {
			languages.put("Java", "a complied high level, object-oriented, platform-independent language");
			System.out.println("Java is successfully added");
		}
		
		languages.put("Python", "an interpreted, object-oriented, hifh-level programming language with dynamic semantic");
		languages.put("BASIC", "Beginners all purpose Symbolic Instruction Code");
		languages.put("Algol", "an algorithmic language");
		languages.put("Lisp", "Therien lies madness");
		
		if(languages.containsKey("Jav")) {
			System.out.println("Java is already in the map");
		}else {
			languages.put("Java", "The course is all about java");
		}
//		System.out.println(languages.get("Java"));
//		languages.put("Java", "This course is all about java");
//		System.out.println(languages.get("Java"));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
//		languages.remove("Lisp");
		if(languages.remove("Algo", "a family of algorithmic languages")) {
			System.out.println("Algo removed");
		}else {
			System.out.println("Algo not removed, key/value pair not found");
		}
		if(languages.remove("Algo", "an algorithmic language")) {
			System.out.println("Algo removed");
		}else {
			System.out.println("Algo not removed, key/value pair not found");
		}
		
		if(languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")) {
			System.out.println("Lisp replaced");
		}else {
			System.out.println("Lisp not removed, because it doesnot matched");
		}
		
		if(languages.replace("Lisp", "Therien lies madness", "a functional programming language with imperative features")) {
			System.out.println("Lisp replaced");
		}else {
			System.out.println("Lisp not removed, because it doesnot matched");
		}
		
		System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
		System.out.println(languages.replace("Scala", "multitasking language"));
		
		for(String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}
	}
}