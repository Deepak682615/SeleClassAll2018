package com.deepak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		
	ArrayList<String> al = new ArrayList<>();
	al.add("Deepak");
	al.add("Deepak");
	al.add(null);
	al.add(1, "Changed");
	//System.out.println(al);
	
	System.out.println(al.set(3, "aaaa"));
	
/*
	ArrayList<String> al2 = new ArrayList<>();
	al2.add("Ram");
	al2.add("Deepak");
	al.addAll(al2);
	al.clone();
	for (String x : al) {
		System.out.println(x);
		
	}*/
	
	
//Convert ArratList to array
	String arr[]=al.toArray(new String[al.size()]);
	
	for (String i : arr) {
		System.out.println(i);
		
	}
	
	
// Convert array to List
	List<String> ls = new ArrayList();
	ls= Arrays.asList(arr);
	System.out.println(ls);
	
	
	
	}

}
