package selfimpclass;

public interface SelfList<T> {
    void add(T value);
    T get(int index);
    T remove(int index);
}
