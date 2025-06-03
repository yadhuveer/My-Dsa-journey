public class AVLTree {

    private class Node{

        Node right;
        Node left;
        int value;
        int height;

        public Node(int value){

            this.value=value;
        }

    }

    public int height(Node node ){

        if(node==null){
            return -1;
        }

        return node.height;

    }

    private Node root;

    private void insert(int value){
        this.root=insert(value,this.root);
    }

    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }

        if(value<node.value){
            node.left=insert(value,node);
        }

        if(value>node.value){
            node.right=insert(value,node);
        }

        node.height= Math.max(height(node.left),height(node.right))+1;
        return Rotate(node);
    }

    private Node Rotate(Node node){
        if(node.left.height-node.right.height>1){

            if(node.left.left.height-node.left.right.height>0){
                node=rightRotate(node);
            }else{
                node.left=leftRotate(node.left);
                node=rightRotate(node);
            }
        }

        if(node.left.height-node.right.height<-1){

            if(node.right.left.height-node.right.right.height<0){
                node= leftRotate(node);

            }else{
                node.right=rightRotate(node.right);
                node=leftRotate(node);
            }
        }

        return node;

    }

    private Node rightRotate(Node p){

        Node c;
        Node t;

        c=p.left;
        t=c.right;


        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;


        return c;

    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;


        return p;

    }

}
