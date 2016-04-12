package top.trons.lintcode.codinginterviews.reverse;

import java.util.List;

/**
 * Created by trons on 16-4-10.
 */
class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    /**
     * 递归算法
     * @param head
     * @return
     */
//    public ListNode reverse(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode p = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;
//    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        head = pre;
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        System.out.println(listNode.toString());
        Solution solution = new Solution();
        listNode = solution.reverse(listNode);
        System.out.println(listNode.toString());
    }
}
