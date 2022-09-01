package com.mock6;

import java.util.Scanner;

public class FindMinOperationToConvertStrToStr1 {
    static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer str1=new StringBuffer(sc.next());
		StringBuffer str2=new StringBuffer(sc.next());
		
		
		if(str1.length()==str2.length()) {
			equalStrLen(str1,str2);
		}else if(str1.length()>str2.length()){
			int i=0;
			while(str1.length()!=str2.length()) {
				if(str1.charAt(i)==str2.charAt(i)) {
					i++;
				}
				else {
					str1.deleteCharAt(i);
					count++;
					i++;
				}
			}
			
			if(str1.length()==str2.length())
				equalStrLen(str1,str2);	
			
		}else {
			int i=0;
			while(str1.length()!=str2.length()) {
				if(str1.charAt(i)==str2.charAt(i)) {
					i++;
				}
				else {
					str1.insert(i, str2.charAt(i));
					count++;
					i++;
				}
			}
			
			if(str1.length()==str2.length())
				equalStrLen(str1,str2);	
		}
		
		System.out.println(count);
		
	
	}

	public static void equalStrLen(StringBuffer str1,StringBuffer str2) {
		int i=0;
		
		while(i<str2.length()) {
			
				if(str1.charAt(i)==str2.charAt(i)) {
					i++;
				}else {
					String s=String.valueOf(str1.charAt(i));
					str1.replace(i,i+1, s);
					count++;
					i++;
				}
			
		}
	}
}
