package com.day9;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int arr[]= {5,3,9,3,4,7};
		int arr1[]= {3,3,7};
		
//		int arr[] = {1, 2, 3};
//		int arr1[] = {1, 2, 3};
		
		System.out.println(findSubSequence(arr,arr1,arr.length));
	}

     public static int findSubSequence(int[] arr, int[] arr1, int n) {
		
    	 ArrayList<Integer> list=new ArrayList<>();
    	 for(int i=0;i<n;i++) {
    		 list.add(arr[i]);
    	 }
    	 for(int i=0;i<list.size()-1;i++) {
    		 if(list.get(i)>list.get(i+1)) {
    			 list.remove(i);
    		 }
    	 }
    	 int l=list.size();
    	 if(l==n) {
    		 l-=1;
    	 }
		return l;
	}

}
