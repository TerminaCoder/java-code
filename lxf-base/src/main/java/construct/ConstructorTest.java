package construct;

/**
 * @author created by LXF on 2018/6/5 11:27
 */
public class ConstructorTest extends ConstructorTestParent{
    ConstructorTest() {
        System.out.println("子类构造方法");
    }

    ConstructorTest(final String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
    }
}
