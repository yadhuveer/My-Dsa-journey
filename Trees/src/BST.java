public class BST {

    private class Node{
        int value;
        int height;
        Node left;
        Node right;

        public  Node(int value){
            this.value=value;
        }

    }


    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;

    }


    public void insert(int value){
        this.root=insert(value,this.root);
    }

    public void insert(int[] arr1){
        for(int num : arr1){
            this.root=insert(num,this.root);
        }
    }

    private Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }

        if(value<node.value){
            node.left = insert(value,node.left);
        }

        if(value> node.value){
            node.right = insert(value,node.right);
        }

        node.height= Math.max(this.height(node.left),this.height(node.right))+1;

        return node;
    }

    public boolean balanced(){
        return balanced(this.root);
    }


    private boolean balanced(Node node){
        if(node==null){
            return true;
        }

        return Math.abs(this.height(node.left)-this.height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        if(node==null){
            return;
        }


        System.out.println(node.value);
        display(node.left);
        display(node.right);

    }


}
