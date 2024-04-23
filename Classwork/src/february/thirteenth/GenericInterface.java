package february.thirteenth;

public interface GenericInterface<T> {
    void add(T element);
    void remove(T element);
    T get(int index);
}
