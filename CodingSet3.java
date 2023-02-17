package com.cogent.CodingSet3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class CodingSet3 {

	void subString(String a) {
		// Find All substring of string in java Program

		ArrayList<String> SubStrings = new ArrayList<String>();

		for (int i = 1; i <= a.length(); i++) {
			for (int j = 0; j <= a.length() - i; j++) {
				SubStrings.add(a.substring(j, j + i));
			}
		}

		System.out.println("All Sub String of the String " + a + " are as follows: ");
		System.out.println(SubStrings);
	}

	void reverseString(String a) {

		// Print reverse string in java Program
		StringBuilder str = new StringBuilder(a);
		str.reverse();
		System.out.println("Reverse of String " + a + " is " + str);
	}

	void palindrome(int a) {

		// Check Given No is palindrome or Not in java Program
		int r;
		int s = 0;
		int t;

		t = a;
		while (a > 0) {
			r = a % 10;
			s = (s * 10) + r;
			a = a / 10;
		}
		if (t == s) {
			System.out.println("The number is a palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}
	}

	void matrixAddition(int a[][], int b[][]) {

		// How to add two matrix in java Program

		int c[][] = new int[3][3];

		System.out.println("Added Matrix is as follow: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	void matrixMultiplication(int a[][], int b[][]) {

		// How to multiply two matrix in java Program

		int c[][] = new int[3][3];

		System.out.println("Multiplied Matrix is as follow: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	void replaceString(String s1, String s2) {

		// How to replace string with another string in java Program
		s1 = s1.replace(s1, s2);
		System.out.println("Replaced String is " + s1);
	}

	void randomNumber(int n) {

		// How to Generate random number in java Program
		Random r = new Random();

		int r1 = r.nextInt(n);
		System.out.println("Random Integer: " + r1);

	}

	void binarySearch(int array[], int k) {

		// Binary search Program in java

		int result = Arrays.binarySearch(array, k);
		if (result < 0)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}

	void methodOverriding() {

		// How to create Method Overriding program in java
		class Base {

			void disp() {
				System.out.println("This is a Base Class.");
			}
		}

		class Derived extends Base {

			@Override
			void disp() {
				System.out.println("Overriding the disp() method from Base class in Derived Class.");
			}

		}

		Derived d = new Derived();
		d.disp();

	}
}
