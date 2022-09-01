package com.day13;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneButtons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit=sc.nextInt();
		
		int num[]= {2,3,4,5,6,7,8,9};
		String letters[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		ArrayList<String> al=new ArrayList<>();
		String digitStr=String.valueOf(digit);
		for(int i=0;i<digitStr.length();i++) {
		 
			int temp=Character.getNumericValue(digitStr.charAt(i));
			
			for(int j=0;j<num.length;j++) {
				if(temp==num[j]) {
					al.add(letters[j]);
				}
			}	
		}
		System.out.println(al);
		ArrayList<String> mapping=new ArrayList<>();
		if(al.size()==1) {
			String one=al.get(0);
			for(int i=0;i<one.length();i++) {
				
				String temp=String.valueOf(one.charAt(i));
				mapping.add(temp);
			}
		}else {
		   for(int i=0;i>al.size();i++) {
			   
		   }
		}
		
	}

}
