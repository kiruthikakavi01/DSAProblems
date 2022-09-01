package com.day13;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> root=new ArrayList<>();
		for(int i=0;i<n;i++) {
			root.add(sc.next());
		}
		for(int i=0;i<root.size();i++) {
			for(int j=i+1;j<root.size();j++) {
				if(root.get(i).equals(root.get(j))||root.get(i).equals("null")) {
					root.remove(i);
				}
			}
		}
		System.out.println(root.size());

	}

}
