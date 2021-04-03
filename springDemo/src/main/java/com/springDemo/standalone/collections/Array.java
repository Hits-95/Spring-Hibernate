package com.springDemo.standalone.collections;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//String[] arr = { "aqqqq", "bwqwqwqw", "hhhhhhhhhh", "wqwqwqwqwqw" };
		/*
		 * String []arr = { "aqqqq", "bwqwqwqw", "hhhhhhhhhh", "wqwqwqwqwqw" }; String
		 * arr[] = { "aqqqq", "bwqwqwqw", "hhhhhhhhhh", "wqwqwqwqwqw" };
		 */
		
		int arr[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter data: ");
		for(int i = 0; i < 5; i++)
			arr[i] = scan.nextInt();		
		
		/* System.out.println("gap n mashe ... trasss nko deu"); */
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("aaray size : " + arr.length);
	}

	}


