package interviewAL;

/**
 * Created by byhieg on 17/6/1.
 * Mail to byhieg@gmail.com
 */
public class Al45 {

    public Node josephusKill1(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }

        Node last = head;
        //得到链表的最后一个节点
        while (last.next != head) {
            last = last.next;
        }
        int count = 0;
        //这里last在前面，head紧随着last,达到报数条件，就让last.next = head.next,重新报数，退出的唯一条件是只剩下一个1个节点。
        while (head != last) {
            if (++count == m) {
                last.next = head.next;
                count = 0;
            }else{
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }

    public Node josephusKill2(Node head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        Node cur = head.next;
        int tmp = 1;
        while (cur != head) {
            tmp++;
            cur = cur.next;
        }

        tmp = getLive(tmp, m);
        while (--tmp != 0) {
            head = head.next;
        }
        head.next = head;
        return head;
    }


    public int getLive(int i, int m) {
        if (i == 1) {
            return 1;
        }
        return (getLive(i- 1,m) + m -1) % i + 1;
    }

    public static class Node{
        public int data;
        public Node next;
    }
}
