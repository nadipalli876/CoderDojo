package com.RISHI.INTERNET;

public class Logical {

	public boolean and(boolean compare,boolean compare1) {
		boolean answer=compare&&compare1;
		return answer;
	}
	public boolean or(boolean compare,boolean compare1) {
		boolean answer=compare||compare1;
		return answer;
	}
	public boolean not(boolean compare,boolean compare1) {
		boolean answer=!(compare||compare1);
		return answer;
	}

}
