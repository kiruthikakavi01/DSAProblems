package com.day14;


import java.util.Arrays;
import java.util.Scanner;

public class MaximizeProfit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[] =new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		int maxProfit=0;
		int price=0;
		for(int i=0;i<N;i++) {
			
				int temp=arr[i]*(N-i);
				if(maxProfit<temp) {
					maxProfit=temp;
					price=arr[i];
				}
				
			
		}
		

		System.out.println(price);
	}

}
