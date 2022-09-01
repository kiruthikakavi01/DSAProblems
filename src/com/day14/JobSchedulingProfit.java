package com.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class JobSchedulingProfit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] startTime =new int[N];
		int[] endTime=new int[N];
		int[] profit=new int[N];
		
		
		
		int sT=0;
		int eT=0;
		
		int sum=0;
		
			sT=startTime[0];
			eT=endTime[0];
			sum+=profit[0];
			int i=1;
			ArrayList<Integer> al=new ArrayList<>();
			while(i<N) {
			if(eT==startTime[i]) {
				
				
			}
			
			}
			
		

	}

}
