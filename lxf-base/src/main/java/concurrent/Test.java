package concurrent;

import concurrent.cas.CasCounter;
import concurrent.syn.SyncCounter;
import sun.misc.Unsafe;

public class Test {
    public static void main(String[] args) {
        /**
         *  static final Unsafe unsafe = Unsafe.getUnsafe();
         * Exception in thread "main" java.lang.SecurityException: Unsafe
         * 	at sun.misc.Unsafe.getUnsafe(Unsafe.java:90)
         * 	at concurrent.Test.main(Test.java:10)
         * */

        SyncCounter counter = new SyncCounter();
        //CasCounter counter = new CasCounter();

        for (int i = 0; i < 64; i++) {
            Thread thread = new Thread(() -> {
                long begin = System.currentTimeMillis();
                while (true) {
                    if (counter.getValue() >= 100000000)
                        break;
                    else {
                        counter.increment();
                    }
                }

                long end = System.currentTimeMillis();
                long time = end - begin;
                System.out.println("The process is " + Thread.currentThread().getName() +
                        " Value is :" + counter.getValue() + ";" + "time is:" + time);
            });
            thread.start();
        }

    }

}
