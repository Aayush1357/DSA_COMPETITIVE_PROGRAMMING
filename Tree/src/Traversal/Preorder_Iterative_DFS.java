package Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder_Iterative_DFS {

    public static List<Integer> preorderIterative(Node root){
        List<Integer> preorder = new ArrayList<>();
        if (root == null) return preorder;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            root =  stack.pop();
            preorder.add(root.data);

            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }

        return preorder;
    }
    public static void main(String[] args) {
        Node r6 = new Node(9,null,null);
        Node l4 = new Node(8,null,null);
        Node r3 = new Node(7,null,null);
        Node l3 = new Node(6,r6,null);
        Node r2 = new Node(5,null,null);
        Node l2 = new Node(4,l4,null);
        Node rr = new Node(3,l3,r3);
        Node rl = new Node(2,l2,r2);
        Node root = new Node(1,rl,rr);


        List<Integer>  l = preorderIterative(root);
        System.out.println("Preorder Iterative Traversal :  "   + l);
    }
}
