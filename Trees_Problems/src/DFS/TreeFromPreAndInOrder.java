package DFS;

import javax.swing.tree.TreeNode;
import java.util.Arrays;

public class TreeFromPreAndInOrder {


    public static TreeNode constructTree(int[] pre, int[] In){

        if(pre.length==-1){
            return null;

        }

        TreeNode node = new TreeNode(pre[0]);

        int index=0;
        for(int i=0;i<In.length;i++){
            if(In[i]==pre[0]){
                index=i;
            }
        }

        node.left= constructTree(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(In,0,index));
        node.right= constructTree(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(In,index+1,In.length));

        return node;

    }


}
