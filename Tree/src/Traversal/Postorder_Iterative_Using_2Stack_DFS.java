package Traversal;

import java.util.*;
public class Postorder_Iterative_Using_2Stack_DFS {

    // Time Complexity - O(N)
    // Space Complexity - O(2*N)


    public static List<Integer> postorderIterativeUsing2Stack(Node root){


        List<Integer>  postorder = new ArrayList<>();
        if(root == null){
            return postorder;
        }

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);

            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);

        }

        while (!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }

        return postorder;

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


        List<Integer>  l = postorderIterativeUsing2Stack(root);
        System.out.println("Postorder Iterative Traversal Using 2 Stack :  "   + l);


    }
}
