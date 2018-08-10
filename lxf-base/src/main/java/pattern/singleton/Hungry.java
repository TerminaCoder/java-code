package pattern.singleton;

/**
 * @author created by LXF on 2018/6/4 22:33
 * <p>
 * 单例
 * 它有以下几个要素：
 * 1.私有的构造方法。
 * 2.指向自己实例的私有静态引用。
 * 3.以自己实例为返回值的静态的公有的方法。
 */
public class Hungry {
    private final static Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getHungry() {
        return hungry;
    }

}
