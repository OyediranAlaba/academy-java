package com.bptn.course._05_palindrone;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prompt the user for input
		System.out.println("Enter the string to check for palindrome:");
		Scanner scanner =new Scanner (System.in);
		String input =scanner.nextLine();// store the user's input
		String reverseInput ="";//initialize empty string for the reversed input
		// Reverse the input string
		
		for (int i =input.length() -1; i >=0; i--) {
			reverseInput += input.charAt(i);
		}
		// check if the original input and reversed input  are the same 
		if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
			System.out.println("Input string is palindrome");
		} else {
			System.out.println("Input string is not palindrome");
		}

		} 
			
			
		
		

	}


