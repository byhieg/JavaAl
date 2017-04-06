package interviewAL;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by shiqifeng on 2017/3/28.
 * Mail byhieg@gmail.com
 */
public class Test {

    public static void test(String... strings) {
        System.out.println(strings[0]);

        System.out.println("....");
    }

    public void test(Integer a, String... strings) {
        System.out.println(a);
        System.out.println(strings[0]);

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        int a = 21;
        int b = 2;
        a = a ^b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
//        method.invoke(test, new Object[]{new String[]{"123"}});
    }
}
