package pattern.singleton;

/**
 * @author created by LXF on 2018/6/5 8:48
 */
public class LazyOne {
//    public static void main(String[] args) {
//        System.out.println(LazyOne.class.getClasses());
//    }

    private static volatile LazyOne lazyOne = null;

    private LazyOne() {
    }

    public static LazyOne getLazyOne() {
        if (lazyOne == null) {
            synchronized (LazyOne.class) {
                if (lazyOne == null) {
                    lazyOne = new LazyOne();
                }
            }
        }
        return lazyOne;
    }
}
