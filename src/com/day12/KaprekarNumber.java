package com.day12;

import java.util.Scanner;

public class KaprekarNumber {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=(int)Math.pow(n, 2);
		
		String temp=String.valueOf(a);
		
		int div=temp.length()/2;
		String str1="";
		String str2="";
		for(int i=0;i<div;i++) {
			str1+=temp.charAt(i);
		}
		for(int i=div;i<temp.length();i++) {
			str2+=temp.charAt(i);
		}

		int num1=Integer.valueOf(str1);
		int num2=Integer.valueOf(str2);
		
		if(num1==0||num2==0) {
			System.out.println("No");
		}else {
			if(num1+num2==n) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
