package v1;

public class Sqlsession {
    private Configuration configuration;
    private Executor executor;

    public Sqlsession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz, this);
    }

    public <T> T selectList() {
        return executor.selectList();
    }
}
