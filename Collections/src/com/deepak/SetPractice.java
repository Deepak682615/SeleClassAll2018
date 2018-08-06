package com.deepak;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//import com.sun.corba.se.spi.orbutil.proxy.LinkedInvocationHandler;

public class SetPractice {

	public static void main(String[] args) {
		//HashSet
		
		HashSet<Integer> h = new HashSet<>();
		
		h.add(12);
		h.add(12);
		h.add(14);
		h.add(16);
		h.add(18);
		
		System.out.println(h);
		
		
		//LinkedHashSet
	
		LinkedHashSet<Integer>e = new LinkedHashSet<>();
		e.add(10);
		e.add(13);
		e.addAll(h);
		e.add(null);
		System.out.println(e);
		
		//TreeSet
		TreeSet<Integer> t =  new TreeSet<>();
		t.addAll(e);
		System.out.println(t);
	//	t.add(9);
		//t.add(null);
		System.out.println(t);
		
		

	}

}
