package jmm;

import static java.lang.Thread.sleep;

/**
 * Created by LJW on 2018/8/17.
 */
public class VolatileTest2 {
    private boolean flag = true;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        //System.out.println("volatile test");

        VolatileTest2 v = new VolatileTest2();


        Thread t1 = new Thread(() -> {
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            v.setFlag(false);
        });

        Thread t2 = new Thread(() -> {
            while (v.getFlag()) {
            }
        });

        t1.start();
        t2.start();
    }
}
