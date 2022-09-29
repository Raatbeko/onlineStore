package online.jasper.provider;

public interface Provider<R, D> {
    R getData(D data);
}
