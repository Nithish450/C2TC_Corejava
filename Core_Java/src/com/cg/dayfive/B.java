package com.cg.dayfive;
public class B extends A {
	public void display() {
		System.out.println("This is child class");
	}
	
	public static void main(String args[]) {
		B b=new B();
		b.print();
		b.display();
}}
