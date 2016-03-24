package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wulaiquan on 16/3/10.
 */
public class BinaryTreeTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            //控制当前层的遍历次数
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
            //res.add(level);
            //对于II， 我们要逆序加入
            res.add(0, level);
        }
        return res;
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack  = new Stack<>();
        if(root!=null)stack.push(root);
        while(!stack.isEmpty()){
            TreeNode treeNode  = stack.pop();
            if(treeNode.right!=null)stack.push(treeNode.right);
            if(treeNode.left!=null)stack.push(treeNode.left);
            res.add(treeNode.val);
        }
        return res;
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root!=null){
            if(root.left!=null)inOrderTraversal(root.left);
            System.out.print(root.val);
            if(root.right!=null)inOrderTraversal(root.right);
        }
        return list;
    }
    public static List<Integer> PostOrderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root!=null){
            if(root.left!=null)PostOrderTraversal(root.left);
            if(root.right!=null)PostOrderTraversal(root.right);
            System.out.print(root.val);
        }
        return list;
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
        System.out.println(levelOrder(head));
        System.out.println(preOrderTraversal(head));
        System.out.println(inOrderTraversal(head));
        System.out.println(PostOrderTraversal(head));

    }
}
