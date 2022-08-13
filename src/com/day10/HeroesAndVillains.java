package com.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroesAndVillains {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int NV=sc.nextInt();
		int H=sc.nextInt();
		int HE=sc.nextInt();
		ArrayList<Integer> VE=new ArrayList<Integer>();
		for(int i=0;i<NV;i++) {
			VE.add(sc.nextInt());
		}
			
		
		
		
		int remove=0;
	  for(int k=0;k<NV;k++) {

		  Boolean[] bv=new Boolean[VE.size()];
			Boolean[]  bh=new Boolean[H];
			for(int i=0;i<VE.size();i++) {
				bv[i]=true;
            }
			for(int i=0;i<H;i++) {
				bh[i]=true;
            }
		for(int i=0;i<H;i++) {
			int hh=HE;
			for(int j=0;j<VE.size();j++) {
				if(hh>VE.get(j) && bv[j]==true && bh[i]==true) {
					hh=hh-VE.get(j);
					bv[j]=false;
				}
				else if(hh<VE.get(j) && bv[j]==true && bh[i]==true) {
					hh=0;
					bh[i]=false;
					break;
				}
				else if(hh==VE.get(j) && bv[j]==true && bh[i]==true) {
					hh=0;
					bv[j]=false;
					bh[i]=false;
					break;
				}	
				
			}
			
		}
		if(bh[H-1]==false && bv[VE.size()-1]==true )  {
			int y=0;
		VE.remove(y);
			remove++;
			
		}
		else {
			break;
		}
		}
			System.out.println(remove);
}

}