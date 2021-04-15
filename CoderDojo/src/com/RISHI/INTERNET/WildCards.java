package com.RISHI.INTERNET;

import java.util.ArrayList;
import java.util.Collection;

public class WildCards {
	//all though the Object class is the superclass of all java objects the superclass of all java Collection is not Collection<Object> it is the Wildcards
	public static void printAnyCollection(Collection<?> c){
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rishi");
		al.add("Sathvika");
		al.add("Sujatha");
		al.add("Laxman");
		printAnyCollection(al);
		
		
	}

}
