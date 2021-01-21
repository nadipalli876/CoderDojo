package com.RISHI.INTERNET;

import java.util.ArrayList;

public class Holidays {
	public static void main(String[] args) {
		ArrayList<String> holidays=new ArrayList<String>();
		holidays.add("New years");
		holidays.add("Memorial Day");
		holidays.add("Independence Day");
		holidays.add("Labor Day");
		holidays.add("Thanksgiving");
		holidays.add("Christmas");
		System.out.println(holidays);
		HolidayDes newyear=new HolidayDes();
		newyear.date="jan,1";
		newyear.Des="A new year";
		newyear.whyCelebrate="It celebrates the arrival of a new great year!!!!!!!!!!!!";
		System.out.println(newyear.date);
		System.out.println(newyear.Des);
		System.out.println(newyear.whyCelebrate);
		
		
	}
}
