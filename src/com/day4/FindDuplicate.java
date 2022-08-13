package com.day4;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		if(arr[4]==arr[3]) {
			System.out.println(arr[4]);
		}else if(arr[4]==arr[5]) {
			System.out.println(arr[4]);
		}else {
			System.out.println(arr[5]);
		}

	}

}
