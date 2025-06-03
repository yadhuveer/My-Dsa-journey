package DFS;

import java.util.ArrayList;
import java.util.List;

public class SerilaizeAndDeserialize {

    public List<String> Serialize(Node node){

        ArrayList<String> list1 = new ArrayList<>();

        helper(node,list1);
        return list1;
    }

    public void helper(Node node,ArrayList<String> list1){
        if(node==null){
            list1.add(null);
            return;
        }

        list1.add(String.valueOf(node.val));
        helper(node.left,list1);
        helper(node.right,list1);
    }

    public Node Deseriliaze(ArrayList<String> list){


        Node node = helper2(list);
        return node;
    }

    public Node helper2(ArrayList<String> list){

        String val = list.remove(0);
        if(val==null){
            return null;
        }

        Node newNode = new Node(Integer.parseInt(val));
        newNode.left=helper2(list);
        newNode.right=helper(list);
        return node;
    }
}
