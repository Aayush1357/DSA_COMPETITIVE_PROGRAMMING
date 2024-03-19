package Traversal;

public class Inorder_Recursive_DFS {

    public static void inorderTraversal(Node node){

        if (node == null){
            return;
        }

        // Left Root Right
        inorderTraversal(node.left);
        System.out.print(node.data + " -> ");
        inorderTraversal(node.right);



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


        System.out.print("Inorder Recursive Traversal :  ");
        inorderTraversal(root);

    }
}
