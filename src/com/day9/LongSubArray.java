package com.day9;

import java.util.Arrays;

public class LongSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,3,4,2,3,5,6,7};

		int count=1;
		
		for(int i=0;i<arr.length-1;i++) {
			
			
				if(arr[i+1]==arr[i]+1) {
					count++;
				}
				else {
					count=1;
					
				}
			
			
		}
		
		System.out.println(count);

	}

}
