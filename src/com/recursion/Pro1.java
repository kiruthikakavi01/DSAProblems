package com.recursion;

import java.util.Scanner;
// Printing the name N time
public class Pro1 {
   static String name;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		int n=sc.nextInt();
		print(n);

	}
	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(name);
		print(n-1);
	}

}
