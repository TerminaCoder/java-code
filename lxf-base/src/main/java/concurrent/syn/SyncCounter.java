package concurrent.syn;

public class SyncCounter {
    private volatile long value = 0;

    public synchronized long getValue() {
        // TODO Auto-generated method stub
        return value;
    }

    public synchronized long increment() {
        // TODO Auto-generated method stub
        if (value <= 100000000)
            return ++value;
        else
            return value;
    }

}
