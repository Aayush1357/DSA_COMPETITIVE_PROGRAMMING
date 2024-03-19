package Traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {


    public static List<List<Integer>> bfs(Node root){
        // Queue to check the current node
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wraplist = new LinkedList<>();
        if (root == null) return wraplist;
        // Adding root node to queue
        queue.offer(root);


        while (!queue.isEmpty()){
            int levelnum = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < levelnum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().data);
            }
            wraplist.add(sublist);
        }

        return wraplist;
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


        System.out.print("Breadth First Search or Level Search Traversal :  ");
        List<List<Integer>>  l = bfs(root);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j <l.get(i).size() ; j++) {
                System.out.print(l.get(i).get(j) + " -> ");
            }
        }
    }
}
