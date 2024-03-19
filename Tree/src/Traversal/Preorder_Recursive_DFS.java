package Traversal;


public class Preorder_Recursive_DFS {

    public static void preorder(Node node){

        if(node == null){
            return;
        }

        // Root Left Right
        System.out.print(node.data + " -> ");
        preorder(node.left);
        preorder(node.right);

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


        // Preorder traversal
        System.out.print("Preorder Recursive Traversal :  ");
        preorder(root);
        System.out.println("x");

    }
}
