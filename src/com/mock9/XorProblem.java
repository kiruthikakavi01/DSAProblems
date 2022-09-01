package com.mock9;

import java.util.Scanner;

public class XorProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();
		int R=sc.nextInt();
		int count=0;
		for(int i=L;i<=R;i++) {
			int temp=xor(N,i);
			if(N>temp) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static int xor(int N,int i) {
		return (N|i)&(~N|~i);
	}

}
