package com.bptn.course._09_oop;
/*
 * A class is like a construct
 */
public class Employee {
 /*
  * Attributes/properties/fields/Instance variables
  * 
  */
	
	Employee(){};
	
	Employee(int id, String name){
		this.id=id;
		this.name = name;
	}
	
    Employee(int id,String name, double salary,String position){
    	this.id =id;
    	this.name =name;
    }
    
    	
    
    
    private	int id;
    private	String name;
	private double salary;
	private String position;
	
	/*
	 * Getters/Setters
	 * Accessors/ Mutators
	 */
	
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	double getSalary() {
		
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	/*
	 * 
	 */
	void display () {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
		
	}
	double calculateBonus (double percentage) {
		
		double  bonus = salary * (percentage/100);
		
		return bonus;
		
		
		
		
	}
	
}
