package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.ListNode;

/**
 * Created by wulaiquan on 16/3/8.
 */
public  class ReverseListNode {
    public static ListNode reverseListNode(ListNode head) throws Exception {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode p = head.next;
        pre.next=null;
        ListNode temp;
        while (p != null) {
            temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;

        }
        return pre;
    }

    public static void main(String[] args) throws Exception {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode head = reverseListNode(a);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}
