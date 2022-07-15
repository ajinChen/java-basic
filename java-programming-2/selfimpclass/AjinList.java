package selfimpclass;

public class AjinList<Type>{
    // Object Variables
    // use passing Type to create an Array
    private Type[] values;
    private int firstFreeIndex;

    // Constructor**
    public AjinList() {
        // java don't support Type[10], so we create a Object array and convert it into Type[]
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    // Methods
    // Add
    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex += 1;
    }

    // Grow, private for class method used, change the size of List unlimited
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    // Contains
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    // Remove (include findIndex method and moveYoLeft method)
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex -= 1;
    }

    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex; i++) {
            this.values[i] = this.values[i+1];
        }
    }

    // Get, return value depend on index
    public Type get(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    // Index, return index depend on value
    public int index(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Size
    public int size() {
        return this.firstFreeIndex;
    }

}
