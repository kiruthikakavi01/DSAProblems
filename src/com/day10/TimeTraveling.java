package com.day10;

import java.util.Scanner;

public class TimeTraveling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int leapCal[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int nonLeapCal[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int dp=256;
		int days=0;
		int m=dp/31;
		if(year==1918) {
			System.out.println("26."+(m+1)+"."+year);
		}else {
		if(year%4==0) {
			
			for(int i=0;i<m;i++) {
				days+=leapCal[i];
			}	
		}else {
			
			for(int i=0;i<m;i++) {
				days+=nonLeapCal[i];
			}
		}
		int res=dp-days;
		System.out.println(res+"."+(m+1)+"."+year);
		}
		

	}

}
