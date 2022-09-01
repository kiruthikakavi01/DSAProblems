package com.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
}
public class BinarySearchTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rootData=sc.nextInt();
		Node1 rootNode=new Node1(rootData);
		for(int i=0;i<n-1;i++) {
			int data=sc.nextInt();
			Node1 nodeToInsert=new Node1(data);
			insertNode(nodeToInsert,rootNode);
		}
		
		System.out.println("InOrder Traversal: ");
		inOrder(rootNode);
		System.out.println("PostOrder traversal: ");
		postOrder(rootNode);
		System.out.println("PreOrder traversal: ");
		preOrder(rootNode);
		System.out.println("Level Traversal: ");
		levelTraversal(rootNode);
		System.out.println("Depth Traversal: ");
		depth(rootNode);
		
        System.out.println("Min vaule in BST: "+findMin(rootNode));
        System.out.println("Max vaule in BST: "+findMax(rootNode));
        System.out.println("Height: "+findHeight(rootNode));
		

	}
	public static void insertNode(Node1 nodeToInsert,Node1 rootNode) {
		if(nodeToInsert.data<rootNode.data) {
			if(rootNode.left==null) {
				rootNode.left=nodeToInsert;
			}
			else {
				insertNode(nodeToInsert,rootNode.left);
			}
		}else {
			if(rootNode.right==null) {
				rootNode.right=nodeToInsert;
			}else {
				insertNode(nodeToInsert,rootNode.right);
			}
		}
	}
	
	public static void inOrder(Node1 rootNode) {
		if(rootNode==null)
			return;
		
		inOrder(rootNode.left);
		System.out.println(rootNode.data);
		inOrder(rootNode.right);
	}
	public static void preOrder(Node1 rootNode) {
		if(rootNode==null)
			return;
		System.out.println(rootNode.data);
		preOrder(rootNode.left);
		preOrder(rootNode.right);
	}
	public static void postOrder(Node1 rootNode) {
		if(rootNode==null)
			return;
		postOrder(rootNode.left);
		postOrder(rootNode.right);
		System.out.println(rootNode.data);
	}
	
	public static void levelTraversal(Node1 rootNode) {
		if(rootNode==null)
			return;
		
		ArrayDeque<Node1> q=new ArrayDeque<>();
		q.addLast(rootNode);
		
		while(!q.isEmpty()) {
			Node1 temp=q.removeFirst();
			System.out.println(temp.data);
			if(temp.left!=null)
				q.addLast(temp.left);
			if(temp.right!=null)
				q.addLast(temp.right);	
		}
	}
	
	public static void depth(Node1 rootNode) {
		if(rootNode==null)
			return;
		
		Stack<Node1> s=new Stack<>();
		s.push(rootNode);
		while(!s.isEmpty()) {
			Node1 temp=s.pop();
			System.out.println(temp.data);
			
			if(temp.right!=null)
				s.push(temp.right);
			if(temp.left!=null)
				s.push(temp.left);
		}
	}
	
	public static int findMin(Node1 rootNode) {
		int res=0;
		if(rootNode.left==null) {
			res=rootNode.data;
		}else {
			res=findMin(rootNode.left);
		}
		return res;
		
	}
	
	public static int findMax(Node1 rootNode) {
		int res=0;
		if(rootNode.right==null)
			res=rootNode.data;
		else
			res=findMax(rootNode.right);
		
		return res;
	}
	
//	public static void max(Node1 rootNode) {
//		int result=rootNode.data;
//		if(rootNode.right==null) {
//			System.out.println(result);
//		}else {
//			max(rootNode.right);
//		}
//		
//	}
	
	public static int findHeight(Node1 rootNode) {
		int lh=0;
		int rh=0;
		if(rootNode.left!=null) {
			lh = 1 + findHeight(rootNode.left);
		}
		if(rootNode.right!= null){
			rh = 1 + findHeight(rootNode.right);
		}
		return Math.max(lh, rh);
	}
	
	

}
