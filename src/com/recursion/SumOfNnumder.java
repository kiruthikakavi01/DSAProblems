package com.recursion;

import java.util.Scanner;

public class SumOfNnumder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		System.out.print("\n"+sum(n));
	}
	public static int  sum(int n) {
		if(n==0) 
			return 0;
		System.out.print(n+" ");
         return n+sum(n-1);
		
	}



}
