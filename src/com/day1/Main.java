package com.day1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int res=0;
       for(int i=0;i<N;i++) {
    	   int a=sc.nextInt();
    	   for(int j=0;j<=9;j++) {
    		   res+=func(j,0,a);
    		   System.out.println(res);
    	   }
    	   
       }
       System.out.println(res);
	}

	private static int func(int s,int p, int n) {
		// TODO Auto-generated method stub
		
		if(p==n-1)
			return 1;
		int res=0;
		for(int i=s;i<=9;i++) {
			res+=func(i,p+1,n);
			//System.out.println(res);
			
		}
		return res;
		
		
	}

}
