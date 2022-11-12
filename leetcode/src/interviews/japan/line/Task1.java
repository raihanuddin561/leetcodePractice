package interviews.japan.line;

public class Task1 {
    int maxMinProduct(TreeNode root){
        // write your code in Java 8
        int treeHeight = height(root);
        int max = root.val;
        int min = root.val;
        int leftPrev = 1,rightPrev=1;
        int[] arr = {max,min,leftPrev,rightPrev};
        for(int i =1;i<=treeHeight;i++){
            findMaxMinProd(root,arr,i,true);
        }
        return Math.abs(arr[0]-arr[1]);

    }

    private void findMaxMinProd(TreeNode root,int[] arr,int i,boolean isLeft) {
        if(root==null) return;
        if(i==1){
            if(isLeft){
                if(root.val*arr[2]>=arr[0]) {
                    arr[0]=root.val*arr[2];
                }
                else if(root.val*arr[2]<arr[1]) arr[1]=root.val*arr[2];
                arr[2]*=root.val;
            }else{
                if(root.val*arr[3]>arr[0]) {
                    arr[0]=root.val*arr[3];
                }
                else if(root.val*arr[3]<arr[1]) arr[1]=root.val*arr[3];
                arr[3]*=root.val;
            }
        }else{
            findMaxMinProd(root.left,arr,i-1,true);
            findMaxMinProd(root.right,arr,i-1,false);
        }

    }

    int height(TreeNode root){
        if(root == null) return 0;
        else{
            int l = height(root.left);
            int r = height(root.right);
            if(l>r) return l+1;
            else return r+1;
        }
    }

    public int solution(String[] A) {
        return maxMinProduct(new TreeNode(A));
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        public TreeNode(String[] vals) {
            val = Integer.parseInt(vals[0]);
            left = constructFromArray(vals, 1);
            right = constructFromArray(vals, 2);
        }

        private TreeNode constructFromArray(String[] vals, int k) {
            if (k >= vals.length || vals[k].equals("null")) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(vals[k]));
            int leftIndex = 2 * k + 1;
            root.left = constructFromArray(vals, leftIndex);
            int rightIndex = 2 * k + 2;
            root.right = constructFromArray(vals, rightIndex);
            return root;
        }
    }
}
