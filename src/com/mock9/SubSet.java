package com.mock9;

import java.util.Scanner;

public class SubSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int tos=(int)Math.pow(2, N);
		for(int i=0;i<tos;i++) {
			int temp=i;
			String s="";
			for(int j=arr.length-1;j>=0;j--) {
				int r=temp%2;
				temp/=2;
				if(r!=0) {
					s=arr[j]+s;
				}
			}
			
			System.out.println(s);
		}
		

	}

}
