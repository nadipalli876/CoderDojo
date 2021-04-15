package com.RISHI.INTERNET;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.remove(4);
		System.out.println(vector);
		
		//ArrayList is a non synchronized Vector!!!
		//Has a fast adding process!!!
		//But removing stuff is not so fast.
		ArrayList<String> arrL=new ArrayList<>();
		arrL.add("Rishi");
		arrL.add("Sathvika");
		arrL.add("Laxman");
		arrL.add("Sujatha");
		arrL.remove(3);
		System.out.println(arrL);
		
		//LinkedLists are for heavy removal applications
		//adding stuff is harder.
		LinkedList<String> lList=new LinkedList<>();
		lList.add("Hi ");
		lList.add("my ");
		lList.add("name is ");
		lList.add("Rishi!!!");
		lList.add("!");
		lList.remove(4);
		System.out.println(lList);
		
		
		

	}

}
