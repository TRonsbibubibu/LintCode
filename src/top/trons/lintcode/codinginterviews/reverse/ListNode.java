package top.trons.lintcode.codinginterviews.reverse;

/**
 * Created by trons on 16-4-10.
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public void addNode(int val){
        ListNode tmp = new ListNode(val);
        tmp.next = this.next;
        this.next = tmp;
    }

    @Override
    public String toString() {
        String s = Integer.toString(val)+"->";
        ListNode p = next;
        while(p != null){
            s += p.val+"->";
            p = p.next;
        }
        s += "null";
        return s;
    }
}
