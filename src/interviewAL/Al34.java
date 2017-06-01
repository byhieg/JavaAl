package interviewAL;

import tools.FullPrint;

/**
 * Created by shiqifeng on 2017/5/9.
 * Mail byhieg@gmail.com
 */
public class Al34 {


    public void printCommonPart(Node head1,Node head2){
        System.out.println("共同的部分: ");
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            } else if (head1.value > head2.value) {
                head2 = head2.next;
            }else{
                FullPrint.printResult(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

    static class Node{
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

}
