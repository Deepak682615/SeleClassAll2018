package com.deepak;

import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> a= new LinkedList<>();
		a.add(10);
		a.add(null);
		a.add(12);
		a.add(13);
		a.add(null);
		System.out.println(a.get(2));
		System.out.println(a);
		
		System.out.println("=================");
		a.set(1, 15);
		System.out.println(a);
		
		

	}

}
