package com.mock9;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(gcd(n1,n2));
		

	}
	public static int gcd(int n1,int n2) {
		int g,s,r;
		if(n1>n2){
			g=n1;
			s=n2;
		}else {
			g=n2;
			s=n1;
		}
		r=g%s;
		if(r==0)
			return s;
		
		return gcd(r,s);
	}

}
