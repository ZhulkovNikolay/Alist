public class MyArrayList<T> {

    private final int SIZE = 16;
    private int pointer = 0; //номер последнего значищего элемента нашего массива
    private Object[] array = new Object[SIZE];

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void add(T item) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }


    public int size() {
        return pointer;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
            array[pointer] = null;
            pointer--;
        }

    }

}
