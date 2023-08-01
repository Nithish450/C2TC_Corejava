package com.cg.daysix;

public class Student {
		int rollno;
		String name;
		static String clg="ifet";
		Student(int r,String s){
			rollno=r;
			name=s;
		}
		void display() {
			System.out.println(rollno+" "+name+" "+clg);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student s=new Student(1,"Raja");
			Student s1=new Student(2,"Raju");
			s.display();
			s1.display();
			

		}

	}


