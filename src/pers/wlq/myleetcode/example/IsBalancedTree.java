package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.TreeNode;

/**
 * Created by wulaiquan on 16/3/9.
 */
public class IsBalancedTree {
    public static boolean isBalanced(TreeNode root) {


        return true;
    }
    public static int checkBalanced(TreeNode root){

        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
