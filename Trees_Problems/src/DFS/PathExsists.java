package DFS;

public class PathExsists {

    public boolean pathExsist(TreeNode root, int[] arr, int index){


        if(root==null){
            return false;
        }

        if(index==arr.length-1 && arr[index]==root.val && root.left==null && root.right==null ){

            return true;
        } else if (index== arr.length-1) {
            return false;
        }


        if(arr[index]!=root.value){

            return false;
        }

        boolean left = pathExsist(root.left,arr,index+1);
        if(left){
            return left;
        }
        boolean right = pathExsist(root.right,arr,index+1);

        return right;

    }

}
