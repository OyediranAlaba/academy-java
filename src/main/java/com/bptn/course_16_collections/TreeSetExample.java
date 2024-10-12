package com.bptn.course_16_collections;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {
	


		public static void main(String[] args) {
			

			//Create an object of TreeSet
			Set<String> treeSet = new TreeSet<>();
			
			treeSet.add("mango");
			treeSet.add("cherry");
			treeSet.add("apple");
			treeSet.add("banana");
			treeSet.add("pineapple");
			
			treeSet.add("mango"); //It allows duplicates ? No
			
			//treeSet.add(null); //It allows null values?  No
			
			
			System.out.println("TreeSet is : "+ treeSet);
			
			
		}

	}

	//Major key takeaways:

	//1. Insertion Order -  Natural ascending order
	//2. It allows null values?   No null values- it throws NullPointerException
	//3. It allows duplicates ? No
	//4. Underlying implementation-   
	//5. Is a TreeSet indexed ? -   


	


