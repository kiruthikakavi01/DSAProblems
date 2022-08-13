package com.day3;

import java.util.Scanner;

public class SwapAndFlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		String S=sc.next();
		
		int cash=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		char[] ch=S.toCharArray();
		if(a<cash) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
			if(ch[i]=='0'&& cash>a) {
				
					if(ch[j]!='0') {
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
						cash-=a;
						
					}
			}
			}
			
		}}if(b<cash) {
			
				for(int j=0;j<ch.length;j++) {
				if(ch[j]=='1'&& cash>b) {
					
						ch[j]='0';
						cash-=b;
						
						if(b<cash) {
							break;
						}
				}
				
		}
		
	
	}
		String s=String.valueOf(ch);
		int decimal=0;
		int pow=0;
		
		for(int i=s.length()-1;i>=0;i--) {
			int digit=Character.getNumericValue(s.charAt(i));
			decimal+=digit*Math.pow(2, pow);
			pow++;
			
		}
		System.out.println(decimal);
	
	 
		

}
}
