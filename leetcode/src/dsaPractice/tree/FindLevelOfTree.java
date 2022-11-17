package dsaPractice.tree;

import java.util.*;

public class FindLevelOfTree {
    static class TreeNode{
        int val;
        TreeNode left,right,parent;
        public TreeNode(){}
        public TreeNode(int val){
            this.val=val;
            left=right=parent=null;
        }
    }
    static TreeNode root;
    static TreeNode temp = root;
    int height(TreeNode root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(rightHeight<leftHeight) return leftHeight+1;
        else return rightHeight+1;
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null) return true;
       return checkValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean checkValidBST(TreeNode root, long min,long max){
        if(root==null) return true;
        if (root.val<=min||root.val>=max) return false;
        return (checkValidBST(root.left,min,root.val)&&checkValidBST(root.right,root.val,max));
    }
    public void postOrderTraversalWith2Stack(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()){
            TreeNode temp = s1.pop();
            s2.push(temp);
            if(temp.left!=null) s1.push(temp.left);
            if(temp.right!=null) s1.push(temp.right);

        }
        while (!s2.isEmpty()){
            TreeNode node = s2.pop();
            System.out.print(node.val+" ");
        }
    }
    public boolean isSymmetric(TreeNode node){
        if(node==null) return  true;
        if(node.left==null&&node.right==null) return true;
        return checkSymmetric(node.left,node.right);
    }

    private boolean checkSymmetric(TreeNode leftNode, TreeNode rightNode) {
       if(leftNode.val==rightNode.val){
           return checkSymmetric(leftNode.left,rightNode.right)&&checkSymmetric(leftNode.right,rightNode.left);
       }
       return false;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        while (curr!=null||!s.isEmpty()){
            while (curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr = s.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
    void levelOrderPrint(TreeNode root){
        int h = height(root);
        List<List<Integer>> lists = new ArrayList<>();
        for(int i =1;i<=h;i++){
            List<Integer> list = new ArrayList<>();
            printLevelOrder(root,i,list);
            lists.add(list);
        }
      //  printLevelOrder(root,h);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h = height(root);
        List<List<Integer>> lists = new ArrayList<>();
        boolean direction = true;
        for(int i =1;i<=h;i++){
            List<Integer> list = new ArrayList<>();
            getLevelOrder(root,i,list,direction);
            if(direction) direction = false;
            else direction = true;
            lists.add(list);
        }
        return lists;
    }
    void getLevelOrder(TreeNode root, int level,List<Integer> list,boolean isLeftToRight){
        if(root==null) return ;
        if(level==1) {
            list.add(root.val);
        }else if(level>1) {
            if (isLeftToRight) {
                if (root.left != null) {
                    getLevelOrder(root.left, level - 1, list, isLeftToRight);
                }
                if (root.right != null) {
                    getLevelOrder(root.right, level - 1, list, isLeftToRight);
                }
            } else {
                if (root.right != null) {
                    getLevelOrder(root.right, level - 1, list, isLeftToRight);
                }
                if (root.left != null) {
                    getLevelOrder(root.left, level - 1, list, isLeftToRight);
                }
            }
        }
    }
    boolean changeDirection(boolean isLeftToRight){
        if(isLeftToRight) isLeftToRight=false;
        else isLeftToRight=true;
        return isLeftToRight;
    }
    TreeNode insertWithParent(TreeNode node,int val){
        if(node==null){
            return new TreeNode(val);
        }
        else{
            TreeNode temp = null;
            if(val<=node.val){
                temp = insertWithParent(node.left,val);
                node.left=temp;
                temp.parent=node;
            }else{
                temp = insertWithParent(node.right,val);
                node.right=temp;
                temp.parent=node;
            }
            return node;
        }


    }
    TreeNode inOrderSuccessor(TreeNode root,TreeNode n){
        if(n.right!=null){
            return minValueOfNode(n.right);
        }
        TreeNode p = n.parent;
        while (p!=null && n == p.right){
            n = p;
            p = p.parent;
        }
        return p;
    }
    TreeNode minValueOfNode(TreeNode node){
        TreeNode current = node;
        while (current.left!=null){
            current = current.left;
        }
        return current;
    }
    int minValue(TreeNode node){
        if(node==null) return 0;
        int min = node.val;
        if(node.left!=null){
            int m = minValue(node.left);
            if(m<min) min =m;
        }
        if(node.right!=null){
            int m = minValue(node.right);
            if(m<min) min=m;
        }
        return min;
    }
    int maxValue(TreeNode node){
        if (node==null) return 0;
        int max = node.val;
        if(node.left!=null){
            int m = maxValue(node.left);
            if(m<max) max =m;
        }
        if(node.right!=null){
            int m = maxValue(node.right);
            if(m<max) max=m;
        }
        return max;
    }
    void printLevelOrder(TreeNode root, int level,List<Integer> list){
        if(root==null) return ;
        if(level==1) {
            System.out.print(root.val+" ");
            list.add(root.val);
        }
        if(root.left!=null){
            printLevelOrder(root.left,level-1,list);
        }
        if(root.right!=null){
            printLevelOrder(root.right,level-1,list);
        }
    }
    void printLevelOrderUsingQue(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode tempNode = q.poll();
            if(tempNode.left==null&&tempNode.right==null){
                System.out.print(tempNode.val + " ");
            }
            if(tempNode.left!=null){
                q.add(tempNode.left);
            }
            if(tempNode.right!=null){
                q.add(tempNode.right);
            }
        }
    }

    int searchIndex(int[] arr,int strt,int end,int val){
        int i;
        for( i=strt;i<=end;i++){
            if(arr[i]==val)return i;
        }
        return i;
    }
   static int preIndex=0;
    TreeNode buildTree(int[] in,int[] pre,int inStrt,int inEnd){
        if(inStrt>inEnd) return null;
        TreeNode buildNode = new TreeNode(pre[preIndex++]);
        if(inStrt==inEnd) return buildNode;
        int inIndex = searchIndex(in,inStrt,inEnd,buildNode.val);
        buildNode.left = buildTree(in,pre,inStrt,inIndex-1);
        buildNode.right = buildTree(in,pre,inIndex+1,inEnd);
        return buildNode;
    }
    TreeNode buildTreeFromPost(int[] in,int[] post,int inStrt,int inEnd){
        if(inStrt>inEnd) return null;
        TreeNode buildNode = new TreeNode(post[preIndex--]);
        if(inStrt==inEnd) return buildNode;
        int inIndex = searchIndex(in,inStrt,inEnd,buildNode.val);
        buildNode.right = buildTreeFromPost(in,post,inIndex+1,inEnd);
        buildNode.left = buildTreeFromPost(in,post,inStrt,inIndex-1);
        return buildNode;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTreeFromArr(nums,0,nums.length-1);
    }

    private TreeNode buildTreeFromArr(int[] nums, int start, int end) {
        if(start>end) return null;
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTreeFromArr(nums, start,mid-1);
        node.right = buildTreeFromArr(nums,mid+1,end);
        return node;
    }

    public static void main(String[] args) {
        FindLevelOfTree tree = new FindLevelOfTree();
       /* TreeNode root = null,temp=null,suc = null,min=null;
        root = tree.insertWithParent(root,20);
        root = tree.insertWithParent(root,8);
        root = tree.insertWithParent(root,22);
        root = tree.insertWithParent(root,4);
        root = tree.insertWithParent(root,12);
        root = tree.insertWithParent(root,10);
        root = tree.insertWithParent(root,14);
        temp = root.left.right.right;
        suc = tree.inOrderSuccessor(root,temp);
        if(suc!=null){
            System.out.println("Inorder successor of "+temp.val+" is "+suc.val);
        }else{
            System.out.println("Inorder successor does not exist");
        }*/
      //  tree.root = new TreeNode(2147483647);
       // tree.root = new TreeNode(5);
      /*  tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(6);
        tree.root.right.left=new TreeNode(3);
        tree.root.right.right=new TreeNode(7);*/
       // System.out.println(tree.isValidBST(tree.root));

       /* tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);*/

      /*  System.out.println("Level order traversal of"
                + "binary tree is ");*/
      // tree.printLevelOrderUsingQue(root);
       /* List<Integer> list = tree.inorderTraversal(root);
        for(int val:list) System.out.println(val);*/
        //tree.levelOrderPrint(root);

       // System.out.println(tree.isValidBST(root));
       // tree.postOrderTraversalWith2Stack(root);
       /* tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left=new TreeNode(15);
        tree.root.right.right=new TreeNode(7);*/
       /* tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left=new TreeNode(4);
        tree.root.right.right=new TreeNode(5);
        tree.zigzagLevelOrder(root);*/
       /* int[] in = {9,3,15,20,7};
        int[] pre = {3,9,20,15,7};*/
        /*int[] in = {-1};
        int[] pre = {-1};*/
        /*int[] in = {9,3,15,20,7};
        int[]post = {9,15,7,20,3};
        preIndex = in.length-1;
        tree.postOrderTraversalWith2Stack(tree.buildTreeFromPost(in,post,0,in.length-1));*/
      // List<Integer> lists= tree.inorderTraversal(tree.buildTree(in,pre,0,in.length-1));
       /*for (int i:lists){
           System.out.println(i);
       }*/

        int[] arr = {0,1,2,3,4,5};
        //int[] arr = {-10,-3,0,5,9};
        TreeNode node = tree.sortedArrayToBST(arr);
        System.out.println(node);
    }
}
