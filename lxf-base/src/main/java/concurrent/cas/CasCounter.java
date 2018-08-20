package concurrent.cas;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class CasCounter {

    private volatile long value = 0;

    private static Unsafe un;
    private static long valueOffset;

    private static Unsafe getUnsafeInstance() throws SecurityException,
            NoSuchFieldException, IllegalArgumentException,
            IllegalAccessException {
        Field theUnsafeInstance = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafeInstance.setAccessible(true);
        return (Unsafe) theUnsafeInstance.get(Unsafe.class);
    }

    static {
        try {
            un = getUnsafeInstance();
            //偏移量可以简单理解为指针指向该变量的内存地址
            valueOffset = un.objectFieldOffset(CasCounter.class.getDeclaredField("value"));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("init unsafe error!");
        }
    }

    public long getValue() {
        // TODO Auto-generated method stub
        return value;
    }

    public long increment() {
        // TODO Auto-generated method stub
        long current;
        long next;

        for (; ; ) {
            current = value;
            next = current + 1;

            if (value >= 100000000)
                return value;
            if (un.compareAndSwapLong(this, valueOffset, current, next))
                return next;
        }
    }
}
