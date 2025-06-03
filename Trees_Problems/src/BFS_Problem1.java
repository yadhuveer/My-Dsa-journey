import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_Problem1 {

    public List<List<Integer>> levelOrder(TreeNode root){


        List<List<Integer>> result = new ArrayList<>();
        int size;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){

            List<Integer> levelList = new ArrayList<>();
            size=queue.size();

            for(int i=0; i<size;i++){
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(levelList);
        }
        return result;

    }
}
