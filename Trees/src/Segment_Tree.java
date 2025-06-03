public class Segment_Tree {

    private class Node{
        int value;
        Node left;
        Node right;
        int start;
        int end;

        public Node(int start,int end){
            this.start=start;
            this.end=end;
        }

    }

    Node root;

    public void CreateTree(int[] arr){

        this.root=CreateTree(arr,0,arr.length-1);
    }

    private Node CreateTree(int[] arr,int start,int end){

        if(start==end){
            Node node = new Node(start,end);
            node.value=arr[start];
            return node;
        }

        Node node = new Node(start,end);
        int mid= start+(end-start)/2;

        node.left=CreateTree(arr,start,mid);
        node.right=CreateTree(arr,mid+1,end);

        node.value=node.left.value+node.right.value;

        return node;


    }

    public int getSum(int start, int end){
        return getSum(this.root,start,end);

    }

    private int getSum(Node node, int start, int end){

        if(node.start>=start && node.end<=end){
            return node.value;
        } else if (start> node.end || end<node.start) {
            return 0;
        }else{
            return getSum(node.left,start,end)+getSum(node.right,start,end);
        }
    }

    public void update(int index, int value){
        this.root.value=update(this.root,index,value);
    }

    private int update(Node node,int index, int value){

        if(node.start>index || node.end< index){
            return node.value;
        }

        if(index==node.start && index== node.end){
            node.value=value;
            return value;
        }



        int leftValue= update(node.left,index, value);
        int rightValue= update(node.right,index, value);
        node.value=leftValue+rightValue;
        return node.value;
    }
}
