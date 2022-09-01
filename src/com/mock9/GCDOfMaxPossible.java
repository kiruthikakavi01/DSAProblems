package com.mock9;

import java.util.Arrays;
import java.util.Scanner;

public class GCDOfMaxPossible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		
		for(int i=max;i>=1;i--) {
			int count=0;
			int index=0;
			for(int j=0;j<n;j++) {
				if(arr[j]%i==0) {
					count++;
					
				}else {
					
					index=j;
				}
			}
			if(count==n-1) {
				arr[index]=max;
				break;
			}
			
		}
		
		for(int i=max;i>=1;i--) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[j]%i==0) {
					count++;
				}
			}
			
			if(count==n) {
				System.out.println(i);
				break;
			}
		}

	}

}
