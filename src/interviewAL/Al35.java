package interviewAL;

/**
 * Created by shiqifeng on 2017/5/9.
 * Mail byhieg@gmail.com
 */
public class Al35 {

    public Node removeLastKthNode(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        Node cur = head;
        while (cur != null) {
            k--;
            cur = cur.next;
        }

        if (k > 0) {
            return head;
        }
        if (k == 0){
            return head.next;
        }
        if (k < 0){
            cur = head;
            while (++k != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }

        return head;
    }

    static class Node{
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
}
