package com.deepak;


import java.util.HashMap;
import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

public class MapPractice {

	public static void main(String[] args) {
		// HashMap
	
	HashMap<Integer, String> h= new HashMap<>();
	h.put(101, "Deepak");
	h.put(null, "xxx");
	h.put(104, "aaa");
	System.out.println(h.get(104));
	System.out.println(h);

	
		// counting chars in sentence
		String sentence ="I love Pune and I live in Pune";
		
		sentence= sentence.replaceAll(" ", "");
		
		TreeMap<Character, Integer> op = new TreeMap<>();
		System.out.println(op);
		
		for (int i = 0; i < sentence.length(); i++) {
			char key=sentence.charAt(i);
			if(op.containsKey(key)) {
				op.put(key, op.get(key)+1);
			}
			else {
				op.put(key, 1);
			}	
		}
		System.out.println(op);
	}

}
