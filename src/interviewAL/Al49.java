package interviewAL;

import java.util.Stack;

/**
 * Created by byhieg on 17/6/1.
 * Mail to byhieg@gmail.com
 */
public class Al49 {

    public static class Node{
        public int data;
        public Node next;

    }

    public boolean isPalidrome1(Node head) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null) {
            if (head.data != stack.pop().data) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalidrome2(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node right = head.next;
        Node cur = head;
        //通过cur一次走2步，right一次走一步的形式来实现right移动到链表的中间
        while (cur.next != null && cur.next.next != null) {
            right = right.next;
            cur = cur.next.next;
        }

        Stack<Node> stack = new Stack<>();
        while (right != null) {
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()) {
            if (head.data != stack.pop().data) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalidrome3(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node n1 = head;
        Node n2 = head;
        //通过这样，得到中间节点n1,末尾节点n2
        while (n2.next != null && n2.next.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;

        Node n3 = null;
        //反转n1开头的链表
        while (n2 != null) {
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }

        n3 = n1;
        n2 = head;
        boolean res = true;
        while (n1 != null && n2 != null) {
            if (n1.data != n2.data) {
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }

        n1 = n3.next;
        n3.next = null;
        while (n1 != null) {
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }

        return res;
    }
}
