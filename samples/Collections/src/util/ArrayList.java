package util;

public class ArrayList<T> {

    private Object[] array;

    public ArrayList() {
        array = new Object[0];
    }

    public int size() {
        return array.length;
    }

    public void add(T value) {
        int originalSize = array.length; // array = [1, 2, 3]
        Object[] copy = array; // array = copy = [1, 2, 3]
        array = new Object[originalSize + 1]; // copy = [1, 2, 3] | array = [ , , , ]

        for(int i = 0; i < originalSize; i++) {
            array[i] = copy[i];
        }

        int newSize = array.length;
        // place value at the last position
        array[newSize - 1] = value;
    }

    public T[] subArray(int startIndex, int endIndex) {
        int size = endIndex - startIndex + 1;
        Object[] result = new Object[size];

        for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
            result[j] = array[i];
        }

        return (T[])result;
    }

    public T get(int index) throws IllegalArgumentException {
        if(index < 0 || index >= array.length)
            throw new IllegalArgumentException("Index out of range: " + index);

        return (T)array[index];
    }

    public String toString() {
        String aux = "";

        for(int i = 0; i < array.length; i++) {
            aux += array[i] + ", ";
        }

        return aux;
    }
}
