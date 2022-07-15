package selfimpclass;

import java.util.List;

public class AjinHashMap<K, V> {
    // object variables, using Pair class and List class
    private AjinList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    // Constructor
    public AjinHashMap() {
        this.values = new AjinList[32];
        this.firstFreeIndex = 0;
    }

    // Methods
    // Get
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        AjinList<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        return null;
    }

    // Add
    public void add(K key, V value) {
        AjinList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex += 1;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    // get bucket based on key
    private AjinList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new AjinList<>();
        }
        return values[hashValue];
    }

    // get Pair based on key
    private int getIndexOfKey(AjinList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Grow, when space is full
    private void grow() {
        AjinList<Pair<K, V>>[] newValues = new AjinList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }
        this.values = newValues;
    }

    private void copy(AjinList<Pair<K, V>>[] newArray, int fromIndex) {
        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> value = this.values[fromIndex].get(i);
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new AjinList<>();
            }
            newArray[hashValue].add(value);
        }
    }

    // Remove
    public V remove(K key) {
        AjinList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

}
