package com.cg.daythree.control;

public class Cons {
	int id;  
    String name;  
    //creating a parameterized constructor  
   Cons(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);} 

	public static void main(String[] args) { 
		   
		   Cons s1 = new Cons(1,"Raja");  
		   Cons s2 = new Cons(2,"Raj");  
		    //calling method to display the values of object  
		    s1.display();  
		    s2.display();   

	}

}
