package jmm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class VisibilityTest {
    private volatile int[] a = new int[10000];
    private CountDownLatch downLatch = new CountDownLatch(2);
//    private volatile String[] b = new String[100];


    public static void main(String[] args) throws InterruptedException {
        VisibilityTest memoryTest = new VisibilityTest();

//        for(int a = 0; a < 100; a++) {
//            memoryTest.b[a] = a + "a";
//        }
        Thread thread = new Thread(() -> {
            //System.out.println("线程1");
//            synchronized (memoryTest) {
            for (int i = 0; i < 10000; i++) {
//                System.out.println("线程1增加 ");
                memoryTest.a[i]++;
            }
            memoryTest.downLatch.countDown();
//            }

//            try {
//                Thread.sleep(100000000000l);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }, "111");


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                System.out.println("线程2");
                memoryTest.a[i]++;
            }
            memoryTest.downLatch.countDown();
//            synchronized (memoryTest) {
            //System.out.println("线程2增加 " + Arrays.toString(memoryTest.a));
//            }
//            System.out.println("线程2 memoryTest " + memoryTest.a);
        }, "222");

        thread.start();
        thread2.start();


//        thread.join();
//        thread2.join();
//        Thread.join()
        memoryTest.downLatch.await();
        System.out.println("正常 " + Arrays.toString(memoryTest.a));

    }

}
