package DFS;

public class PathSum {

    public boolean pathSum(Node node,int sum,int pathSum){



        if(node==null){
            return false;
        }
        sum+=node.val;

        if(node.left==null && node.right==null){
            if(pathSum==sum){

                return true;
            }else{
                return false;
            }


        }


        boolean left= pathSum(node.left,sum,pathSum);
        if(left){
            return left;
        }
        boolean right= pathSum(node.right,sum,pathSum);
        return right;
    }
}
