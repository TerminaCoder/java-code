package jvm;

import java.util.HashMap;
import java.util.Map;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

public class Test2 {
    private String s = "0";

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {

        this.s = s;
    }


    public static void main(String[] args) {
        String[] s = {
                "1", "2", "3", "4"
        };
        for(String[] temp = s;;) System.out.println(temp.length);
//        System.out.println(tableSizeFor(1));
//        Map map = new HashMap(1);
//        map.put("1", "e");
    }
}
