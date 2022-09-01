package com.day12;

import java.util.*;

public class SweetProblem {

	static int n3;
	static int n2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n);
		if (((n3 * 3) + n2) != n || n2 == 1) {
			n3 -= 1;
			n2 = 4;
		}
		long ans = 0;
		
		ans = (long) Math.pow(3,n3);
	
		System.out.print("[");
		for (int i = 0; i < n3; i++) {
			System.out.print(3 + " , ");
		}
		System.out.print(n2);
		System.out.println("]");
		if(n2!=0)
		System.out.println(" the max product is : " + ans * n2);
		else 
			System.out.println(" the max product is : " + ans);
			
	}

	private static void fun(int n) {
		n3 = n / 3;
		n2 = n % 3;
	}

}