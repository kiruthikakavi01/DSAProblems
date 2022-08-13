package com.day7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assessment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n/2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				if(arr[i][j]<arr[i][j+1]) {
					sum+=arr[i][j];
					break;
				}else {
					sum+=arr[i][j+1];
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
