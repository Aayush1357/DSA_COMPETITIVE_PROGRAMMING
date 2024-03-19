package Traversal;

import java.util.List;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
    }


    public Node(int data , Node left , Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }


    public static void printDL(List<List<Integer>> list){
        List<List<Integer>>  l = list;
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j <l.get(i).size() ; j++) {
                System.out.print(l.get(i).get(j) + " -> ");
            }
        }
    }

    public static void print(List<Integer> list){
        List<Integer>  l = list;
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " -> ");
        }
    }
}


