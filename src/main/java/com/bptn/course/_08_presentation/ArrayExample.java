package com.bptn.course._08_presentation;

public class ArrayExample {

	public static void main(String[] args) {
		// Declare an array and store 5 int values inside it
int[] myArray= {10,20,30,40,50}; //int[] myArray= new int[5]
		
		//the first element of the array is accessed using index=0 
		
		System.out.println("The first element is: "+ myArray[0]);
		
		System.out.println("The second element is: "+ myArray[1]);
		
		System.out.println("The third element is: "+ myArray[2]);
		
		System.out.println("The fourth element is: "+ myArray[3]);
		
		//the last element of the array is accessed using index=length-1
		System.out.println("The fifth element is: "+ myArray[4]);
		
		System.out.println("The length of the array is: "+ myArray.length);
		
	
		//Access the last element using the length and not the index
		System.out.println("The last element is: "+ myArray[myArray.length-1]);
		
		//Update an element at the first index
		myArray[0]=100;
		
		System.out.println("The updated first element is: "+ myArray[0]);
		
		
	}

}

		



