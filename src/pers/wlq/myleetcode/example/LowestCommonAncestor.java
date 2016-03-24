package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.TreeNode;

/**
 * Created by wulaiquan on 16/3/8.
 */
public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==null || q==null) return null;

        if(Math.max(p.val, q.val) < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if(Math.min(p.val, q.val) > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else return root;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(6);

        head.left=new TreeNode(2);
        head.right=new TreeNode(8);
        head.left.left=new TreeNode(0);
        head.left.right=new TreeNode(4);
        head.right.left = new TreeNode(7);
        head.right.right = new TreeNode(9);
        head.left.right.left=new TreeNode(3);
        head.left.right.right=new TreeNode(5);

        TreeNode treeNode = lowestCommonAncestor(head,head.left,head.left.right);
        System.out.println(treeNode.val);

    }

}
