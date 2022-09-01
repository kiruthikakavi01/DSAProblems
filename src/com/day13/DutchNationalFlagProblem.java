package com.day13;

import java.util.Arrays;
import java.util.Scanner;

public class DutchNationalFlagProblem {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count0++;
			}else if(arr[i]==1) {
				count1++;
			}else if(arr[i]==2) {
				count2++;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(count0>0) {
				arr[i]=0;
				count0--;
			}else if(count1>0) {
				arr[i]=1;
				count1--;
			}else if(count2>0) {
				arr[i]=2;
				count2--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
