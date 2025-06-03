import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level_OrderAverage {

    public  static List<Integer> levelSum(TreeNode root){

        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int size;

        while(! queue.isEmpty()){

            size=queue.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
               sum+=node.val;

                if(node.left!=null){
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offfer(node.right);
                }


            }
            result.add(sum);
        }
        return result;
    }

}
