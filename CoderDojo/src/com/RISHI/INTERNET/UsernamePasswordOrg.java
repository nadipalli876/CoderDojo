package com.RISHI.INTERNET;

public class UsernamePasswordOrg {
	public static <T> void Array2DPrinter(T a[][],int UsernameArrayNum,int Usernameindex,int PasswordArrayNum ,int Passwordindex){
		System.out.print(a[UsernameArrayNum][Usernameindex]+",");
		System.out.print(a[PasswordArrayNum][Passwordindex]);
		
	}
	public static void main(String[] args) {
		String[][] array={{"joe","Sally"},{"1","2"}};
		Array2DPrinter(array,0,1,1,1);
		
	}

}
