package interviewAL;

import javax.management.relation.RoleUnresolved;

/**
 * Created by byhieg on 17/4/6.
 * Mail to byhieg@gmail.com
 */
public class Test1 {

    int a;
    boolean flag;

    public void writer() throws InterruptedException {
        a = 1;
        flag = true;
        Thread.sleep(10);
    }

    public void reader(){
        if(flag){
            int i = a * a;
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    test1.writer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test1.reader();
            }
        }).start();
    }
}
