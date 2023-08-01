package com.cg.daysix;

public class Fin {

	final int x = 10;
	void print() {
		System.out.println(x);
	}

	  public static void main(String[] args) {
	    Fin myObj = new Fin();
	   // myObj.x = 25; will generate an error: cannot assign a value to a final variable
	   myObj.print();

	}

}
