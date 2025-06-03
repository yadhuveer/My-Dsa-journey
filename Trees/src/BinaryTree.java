import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    private void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        this.root = new Node(value);
        populate(scanner,this.root);

    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter to the left of the node: "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left: "+ node.value);
            int leftvalue = scanner.nextInt();
            node.left= new Node(leftvalue);

            populate(scanner,node.left);

        }

        System.out.println("Do you want to enter to the right of the node: "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right: "+ node.value);
            int rightvalue = scanner.nextInt();
            node.right= new Node(rightvalue);
            populate(scanner,node.right);
        }
    }


    public void display(){
        display(this.root,"");
    }

    private void display(Node node,String indent){
        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }
}
