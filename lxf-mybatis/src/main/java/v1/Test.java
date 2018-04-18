package v1;

public class Test {
    public static void main(String[] args) {
        Sqlsession sqlsession = new Sqlsession(new Configuration(), new SimpleExecutor());
        TestMapper testMapper = sqlsession.getMapper(TestMapper.class);
        System.out.println(testMapper.get().get(0));

        TestMapper2 testMapper2 = sqlsession.getMapper(TestMapper2.class);
        System.out.println(testMapper2.get2().get(0));
    }
}
