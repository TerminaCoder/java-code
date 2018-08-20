package jmm;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] i_a = {1, 2, 3, 4, 5};

        Thread t1 = new ProcessThread(i_a);
        t1.start();

        t1.join();
        System.out.println("out========");
        for (int a : i_a) {
            System.out.println(a);
        }
    }
}


class ProcessThread extends Thread {
    private int[] array = null;

    ProcessThread(int[] a) {
        this.array = a;
    }


    @Override
    public void run() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] + 1000;
        }
    }
}