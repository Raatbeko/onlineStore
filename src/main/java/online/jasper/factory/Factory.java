package online.jasper.factory;

public interface Factory<T> {

    T getInstance(String key);

    Factory registry(String key, Class<? extends T> value);

}

