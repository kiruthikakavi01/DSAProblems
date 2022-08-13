package com.day4;

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            

            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int j=1;j<=N;j++){
                ArrayList<Integer> arr =new ArrayList<>();
                adj.add(arr);
            }

            for(int k=0;k<M;k++){
                adj.get(sc.nextInt()).add(sc.nextInt());
            }

            int res[]=topoSt(N,adj);
            for(int l=0;l<res.length;l++){
                System.out.print(res[i]);
            }
        }
        
    }
    public static int[] topoSt(int N,ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st= new Stack<Integer>();
        int visit[]=new int[N];
        for(int i=0;i<N;i++){
            if(visit[i]==0){
               findTopoSort(i,adj,visit,st);
            }
        }

        int topolo[]=new int[N];
        int indx=0;
        while(!st.isEmpty()){
            topolo[indx++]=st.pop();
        }
        //for(int i=0;i<N;i++)
        //System.out.println(topolo[i]+" ");
        return topolo;
    }
    public static void findTopoSort(int n,ArrayList<ArrayList<Integer>> adj,
    int visit[],Stack<Integer> st){
          visit[n]=1;
          for(Integer it:adj.get(n)){
              if(visit[it]==0){
                  findTopoSort(it,adj,visit,st);
              }
          }
          st.push(n);


    }
}