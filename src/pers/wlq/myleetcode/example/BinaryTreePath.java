package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wulaiquan on 16/3/21.
 */
public class BinaryTreePath {
    static List<String> res = new ArrayList<String>();

    public static List<String> binaryTreePaths(TreeNode root) {
        if(root != null) findPaths(root,String.valueOf(root.val));
        return res;
    }

    private static void findPaths(TreeNode n, String path){
        if(n.left == null && n.right == null) res.add(path);
        if(n.left != null) findPaths(n.left, path+"->"+n.left.val);
        if(n.right != null) findPaths(n.right, path+"->"+n.right.val);
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

        System.out.println(binaryTreePaths(head));
    }
}
