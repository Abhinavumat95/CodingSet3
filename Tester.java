package com.cogent.CodingSet3;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodingSet3 c = new CodingSet3();
		
		c.subString("Abhinav");
		System.out.println("::::::::::::::");
		
		c.reverseString("Abhinav");
		System.out.println("::::::::::::::");
		
		c.palindrome(23325);
		System.out.println("::::::::::::::");
		
		int a[][]={{21,5,46},{12,24,42},{91,105,67}};
		int b[][]={{11,7,8},{33,54,22},{77,28,209}};
		c.matrixAddition(a,b);
		System.out.println("::::::::::::::");
		
		c.matrixMultiplication(a, b);
		System.out.println("::::::::::::::");
		
		c.replaceString("Abhi", "Abhinav");
		System.out.println("::::::::::::::");
		
		c.randomNumber(2000);
		System.out.println("::::::::::::::");
		
		int array[] = {31, 22, 45, 55, 101, 12};
		int k = 55;
		c.binarySearch(array, k);
		System.out.println("::::::::::::::");
		
		c.methodOverriding();
	}

}
