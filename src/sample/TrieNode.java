package sample;

import java.util.ArrayList;

public class TrieNode {

    TrieNode[] arr;

    ArrayList<Integer> id = new ArrayList<>(); // id s data structure
    boolean isEnd;
    //Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[36]; //array of character
    }
}
