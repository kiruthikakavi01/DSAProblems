package com.day11;

import java.util.Scanner;

class BikeGame {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(); 
        int V = in.nextInt(); 
        String L0 = in.next(); 
        String L1 = in.next();
        String L2 = in.next();
        String L3 = in.next();
 
        char [][] road=new char[4][L0.length()];
      
       for(int j=0;j<L0.length();j++) {
    	   int i=0;
    	   char ch=L0.charAt(j);
    	   road[i][j]=ch;
       }
       for(int j=0;j<L1.length();j++) {
    	   int i=1;
    	   char ch=L1.charAt(j);
    	   road[i][j]=ch;
       }
       for(int j=0;j<L2.length();j++) {
    	   int i=2;
    	   char ch=L2.charAt(j);
    	   road[i][j]=ch;
       }
       for(int j=0;j<L3.length();j++) {
    	   int i=3;
    	   char ch=L3.charAt(j);
    	   road[i][j]=ch;
       }
        
       for(int i=0;i<4;i++) {
    	   for(int j=0;j<L0.length();j++) {
    		   System.out.print(road[i][j]+" ");
    	   }
    	   System.out.println();
       }
        while (true) {
            int S = in.nextInt(); 
            for (int i = 0; i < M; i++) {
                int X = in.nextInt(); 
                int Y = in.nextInt(); 
                int A = in.nextInt();
                 
                
                
            }

           
            
        }
  }
    
}

