package reflection;

public class ClassReflection {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = ClassReflection.class;
        System.out.println(clazz);
        Class<?> clazz2 = Class.forName("reflection.ClassReflection");
        System.out.println(clazz2);
        Class<?> clazz3 = new ClassReflection().getClass();
        System.out.println(clazz3);
    }
}
