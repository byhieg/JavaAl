package interviewAL;

/**
 * Created by shiqifeng on 2017/5/9.
 * Mail byhieg@gmail.com
 */
public class Al39 {


    public Node removeMidNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        Node pre = head;
        Node cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
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
