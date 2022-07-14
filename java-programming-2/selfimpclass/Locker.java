package selfimpclass;

// passing the type T for class Locker
public class Locker<T> {
    // using customized type
    private T element;

    private void setValue(T element) {
        this.element = element;
    }

    private T getValue() {
        return element;
    }
}
