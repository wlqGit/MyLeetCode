package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.TreeNode;

/**
 * Created by wulaiquan on 16/3/10.
 */
public class HasPathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root.left==null&root.right==null&&sum==root.val)return true;
        if(root.left!=null) hasPathSum(root.left,sum-root.val);
        if(root.right!=null)hasPathSum(root.right,sum-root.val);
        return false;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(6);

        head.left=new TreeNode(2);
        head.right=new TreeNode(8);
        head.left.left=new TreeNode(1);
        head.left.right=new TreeNode(4);
        head.right.left = new TreeNode(7);
        head.right.right = new TreeNode(9);
        head.left.right.left=new TreeNode(3);
        head.left.right.right=new TreeNode(5);

        System.out.println(hasPathSum(head,15));
    }

}
