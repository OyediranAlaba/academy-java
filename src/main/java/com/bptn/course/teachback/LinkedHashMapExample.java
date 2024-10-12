package com.bptn.course.teachback;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkedHashMapExample {
	
	/*
	 * LinkedHashMap preserves insertion order
	 * 
	 */

    public static void main(String[] args) {
    	
        Map<String, Integer> alabaMap = new TreeMap<>();
        
        // Adding elements
        alabaMap.put("Apple", 10);
        alabaMap .put("Banana", 20);
        alabaMap .put("Orange", 30);
        alabaMap .put("Mango", 9);
        alabaMap .put("Avocado", 12);
        alabaMap .put("chery", 12);
		
		
		
        
		System.out.println(alabaMap); // prints elements
		
////        // Accessing elements
    System.out.println("Apple is found in basket number: " + alabaMap.get("Apple"));
    System.out.println("Orange is found in basket number: " + alabaMap.get("Orange"));
////        
////        
//       // Removing an element
    alabaMap.remove("Orange");
    alabaMap.remove("chery");
      System.out.println(alabaMap);
//
////        // Traversing and displaying elements
////        
////        // 1. Iterating using entrySet()
////
////        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        
//        // 2. Iterating using keySet()
//
//        for (String key : linkedHashMap.keySet()) {
//            System.out.println(key + " : " + linkedHashMap.get(key));
//        }
//
//        // 3. Iterating using Iterator
//
//        Iterator<Entry<String, Integer>> iterator = linkedHashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Entry<String, Integer> entry = iterator.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//
//        }
//
//        
//        System.out.println("The final elements: " + linkedHashMap);
    }
}