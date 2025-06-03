import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ZigZag {

    public List<List<Integer>> zigZagOrder(TreeNode root){


        List<List<Integer>> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList();
        boolean reverse = false;
        queue.offer(root);
        int size;

        while(!queue.isEmpty()){
            size=queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i=0;i<size;i++){
                if(!reverse){
                    TreeNode node = queue.pollFirst();
                    if(node.left!=null){
                        queue.addLast(node.left);
                    }
                    if(node.right!=null){
                        queue.addLast(node.right);
                    }

                    levelList.add(node.val);

                }else{
                    TreeNode node = queue.pollLast();
                    if(node.right!=null){
                        queue.addFirst(node.right);
                    }
                    if(node.left!=null){
                        queue.addFirst(node.left);
                    }

                    levelList.add(node.val);
                }
            }
            result.add(levelList);
            reverse=!reverse;
        }
        return result;

    }


}
