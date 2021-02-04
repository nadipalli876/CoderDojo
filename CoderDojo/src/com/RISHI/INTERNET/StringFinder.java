package com.RISHI.INTERNET;

import java.util.Scanner;

public class StringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner scan=new Scanner(System.in);
		String message=scan.nextLine();
		System.out.println("Enter The String You Want To Find:");
		Scanner input=new Scanner(System.in);
		String Find=scan.nextLine();
		int indexOfFind=message.indexOf(Find);
		if(indexOfFind==-1) {
			System.out.println("Index Not Found");
		}else{
			System.out.println("The index of "+Find+" is "+indexOfFind);
		}
	}

}
