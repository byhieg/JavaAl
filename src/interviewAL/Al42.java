package interviewAL;

/**
 * Created by byhieg on 17/6/1.
 * Mail to byhieg@gmail.com
 */
public class Al42 {


    public Node reversePart(Node head, int from, int to) {
        int len = 0;
        Node node1 = head;
        Node fpre = null;
        Node tpos = null;
        //这一步用来找寻from的前一个节点与to的后一个节点。
        while (node1 != null) {
            len++;
            fpre = len == from -1? node1:fpre;
            tpos = len == to + 1? node1:tpos;
            node1 = node1.next;
        }
        if (from > to || from < 1 || to > len) {
            return head;
        }

        node1 = fpre == null ? head: fpre.next;
        Node node2 = node1.next;

        //先把node1的next设置为tpos
        node1.next = tpos;
        Node next = null;

        while (node2 != tpos) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (fpre != null) {
            fpre.next = node1;
            return head;
        }

        return node1;
    }

    public static class Node{
        public int data;
        public Node next;
    }
}
