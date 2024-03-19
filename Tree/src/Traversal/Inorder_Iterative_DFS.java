package Traversal;


import java.util.*;
public class Inorder_Iterative_DFS {

    public static List<Integer> inorderIterative(Node root){
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        Node node = root;

        while (true){
            if (node != null){
                stack.push(node);
                node = node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }

        return inorder;
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

        List<Integer>  l = inorderIterative(root);
        System.out.println("Inorder Interative Traversal :  " + l);
    }
}
