package com.bptn.course._17_maps;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


   public class LinkedHashMapExample{

	

		public static void main(String[] args) {
			
			
			Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
			
			linkedHashMap.put("Jane", 24);
			linkedHashMap.put("Angie", 24);
			linkedHashMap.put("Steve", 26);
			linkedHashMap.put("George", 50);
			linkedHashMap.put(null, 55);
			linkedHashMap.put("Sarah", null);
			linkedHashMap.put("Johnson", null);
			linkedHashMap.put("George", 60);
		}


}