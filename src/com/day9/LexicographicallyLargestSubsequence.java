package com.day9;

import java.util.ArrayList;
import java.util.Collections;


public class LexicographicallyLargestSubsequence {
	static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) {
	      String S="banana";
	      int K=2;
	      
	      for(int i=0;i<S.length();i++) {
	    	  int ascii=S.charAt(i);
	    	  if(!al.contains(ascii)) {
	    		  al.add(ascii);
	    	  }
	      }
	     
	      Collections.sort(al);
	      subSequence(S,K); 
	           
	}

	public static void subSequence(String S,int K) {
		
		for(int i=al.size()-1;i>=0;i--) {
	    	  int a=al.get(i);
	    	  char ch=(char)a;
	    	  int count=0;
	    	  for(int j=0;j<S.length();j++) {
	    		  if(ch==S.charAt(j)) {
	    			  count++;
	    		  }
	    	  }
	    	  if(count>=K) {
	    		  for(int n=0;n<count;n++) {
	    			  System.out.print(ch);
	    		  }
	    		  break;
	    	  }
	      }    
	}
}
