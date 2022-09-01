package com.recursion;

import java.util.Scanner;

public class ReverseNnumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
	    print(1,n);

	}
	private static void print(int i,int n) {
		
		if(n<i)
			return;
		System.out.println(n);
		print(i,n-1);
	}

}
