import org.w3c.dom.Node;

public class NextRightPointer {

    public static void pointer(Node root){

        if(root.left==null){
            return ;
        }

        root.left.next=root.right;

        if(root.next!=null){
            root.right.next=root.next.left;
        }

        pointer(root.left);
        pointer(root.right);
    }
}
