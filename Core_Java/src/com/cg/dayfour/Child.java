package com.cg.dayfour;

public class Child extends SingleInheritance{
	public void display() {
		System.out.println("This is child class");
	}
	
	public static void main(String args[]) {
		Child ch=new Child();
		ch.print();
		ch.display();

	}
}

