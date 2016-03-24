package pers.wlq.myleetcode.example;

import pers.wlq.myleetcode.util.ListNode;

/**
 * Created by wulaiquan on 16/3/18.
 */
public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {

        ListNode pre = new ListNode(0);
        pre.next=head;
        head=pre;
        while(head.next!=null){
            if(head.next.val==val){
                head.next=head.next.next;
            }
            else {
                head=head.next;
            }
        }
        return pre.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(6);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode head = removeElements(a,6);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}
