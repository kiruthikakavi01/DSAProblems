package com.day5;

public class TrieNode {

	
	TrieNode[] children = new TrieNode[26];

	boolean isEnd;

	TrieNode() {
		isEnd = false;
		for (int i = 0; i <26; i++)
			children[i] = null;
	}

}
