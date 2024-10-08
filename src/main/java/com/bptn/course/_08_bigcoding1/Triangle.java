package com.bptn.course._08_bigcoding1;

public class Triangle {
	// Write perimeterCalculator method 
    public int perimeterCalculator(int a, int b, int c) {
        // Return the sum of the sides of the triangle
        return a + b + c;
    }


    // Write areaCalculator method
	
public int areaCalculator(int b, int h) {
        // Return the area of the triangle using the formula: (base * height) / 2
        return (b * h) / 2;
    }

    // Do not modify the code below:
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
}
