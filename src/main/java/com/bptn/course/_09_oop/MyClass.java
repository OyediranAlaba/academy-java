package com.bptn.course._09_oop;

public class MyClass {

	public static void main(String[] args) {
		String str=new String("Hello");
		String str1= "Hello";
		/*
		 * emp1:
		 * Object of class Employee
		 * Instance of  class Employee
		 * Local variable
		 * new is a keyword used to allocate memory
		 *  A constructor is a special method that is called automatically when we create an object of a class. we use constructors in the class
		 *  
		 */
		Employee emp1 = new Employee();
		//emp1.id =1010;
		//emp1.name = "John";
		//emp1.salary = 80_000;
		//emp1.position = "manager";
		
		emp1.display ();
		
		double bonus = emp1.calculateBonus(8);
		
		System.out.println(bonus);
	
		System.out.println("********");
		
		Employee emp2 = new Employee();
		emp2.setId(1020);
		emp2.setName("Jane");
		emp2.setSalary(90_000);
		emp2.setPosition( "accountant");
		
		
		emp2.display();
		bonus = emp2.calculateBonus(10);
		double total = emp2.getSalary() + bonus;
		System.out.println(total);
		
		
		
		

	}

}
