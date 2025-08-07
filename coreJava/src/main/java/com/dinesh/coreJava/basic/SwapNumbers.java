package com.dinesh.coreJava.basic;

import java.util.Scanner;

public class SwapNumbers {
	
	// swap the numbers in 5 ways
	public static void main(String[] args)
	{
		
	   int a = 5;
	   int b = 10;
	   
	   System.out.println("Before swap the a value:"+a);
	   System.out.println("Before swap the b value:"+b);
	   System.out.println();
	   
	   System.out.println("Swap the values with Temp variable:");
	   swapWithTemp(a,b);
	   
	   System.out.println();
        
	   System.out.println("Swap the values with aritmetic values:");
	   swapWithArithmetic(a,b);
    }
	
	public static void swapWithTemp(int a , int b)
	{
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("The after swap the values a:"+a);
		System.out.println("The after swap the values b:"+b);
	}
	
	public static void swapWithArithmetic(int a , int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The after swap the values a:"+a);
		System.out.println("The after swap the values b:"+b);
		
	}
	
	

}
