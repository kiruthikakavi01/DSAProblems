package com.day12;

import java.util.Scanner;

public class SafePlace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();	
		System.out.println(josephus(n,k));
	}
	public static int josephus(int n,int k) {
		return k+1;
	}

}
