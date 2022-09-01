package com.Day2;

import java.util.Scanner;

public class EggDropWith2EggsandNFloor {
	

		
//	static int eggDrop(int n, int k)
//    {
//        
//        if (k == 1 || k == 0)
//            return k;
//
//        if (n == 1)
//            return k;
// 
//        int min = Integer.MAX_VALUE;
//        int x, res;
// 
//       
//        for (x = 1; x <= k; x++) {
//            res = Math.max(eggDrop(n - 1, x - 1),
//                           eggDrop(n, k - x));
//            if (res < min)
//                min = res;
//        }
// 
//        return min + 1;
//    }
 
	 public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = 2;
	        
	        int i=1;
	        
	        while(n>0) {
	        	n=n-i;
	        	//System.out.println(n);
	        	i++;
	        }
	        System.out.println(i-1);
	        
	        
	    }
    
	    
	}
    

