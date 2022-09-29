package online.jasper.factory;

import org.springframework.beans.factory.BeanFactory;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFactory<T> implements Factory<T> {

    private final BeanFactory beanFactory;
    protected Map<String, Class<? extends T>> registry;

    public AbstractFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
        this.registry = new HashMap<>();
    }

    @Override
    public T getInstance(String key) {
        if (key == null)
            throw new RuntimeException("Key cannot be null");
        if (key.isEmpty())
            throw new RuntimeException("Key cannot be empty");
        if (!registry.containsKey(key))
            throw new RuntimeException(String.format("Не найден поставщик услуг: %s", key));
        return this.beanFactory.getBean(registry.get(key));
    }

    @Override
    public Factory registry(String key, Class<? extends T> value) {
        this.registry.put(key, value);
        return this;
    }

}
