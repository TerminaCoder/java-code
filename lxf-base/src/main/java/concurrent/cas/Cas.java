package concurrent.cas;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Cas {
    private volatile long value = 0;

    private static Unsafe un;
    private static long valueOffset;

    static {
        try {
            un = Cas.getUnsafeInstance();
            valueOffset = un.objectFieldOffset(CasCounter.class.getDeclaredField("value"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field unsafe = Unsafe.class.getField("theUnsafe");
        unsafe.setAccessible(true);
        return (Unsafe) unsafe.get(Unsafe.class);
    }
}
