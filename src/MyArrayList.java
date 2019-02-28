
public class MyArrayList implements Cloneable {

    private final int SIZE = 1;
    private int pointer = 0; //номер последнего значищего элемента нашего массива
    private int[] array = new int[SIZE];

    private void resize(int newLength) {
        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void add(Integer item) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

    public int size() {
        return pointer;
    }

    public Integer get(int index) {
        return (Integer) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        // array[pointer] = null;
        pointer--;
    }

    public void bubbleSort() {
        int out, in;
        for (out = array.length - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (this.array[in] > this.array[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    private void change(int a, int b) {
        int tmp = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = tmp;
    }

    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < array.length; out++) {
            mark = out;
            for (in = out + 1; in < array.length; in++) {
                if (this.array[in] < this.array[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert(){
        int in, out;
        for(out = 1;out < array.length; out++){
            int temp = this.array[out];
            in = out;
            while(in > 0 && this.array[in-1] >=temp){
                this.array[in] = this.array[in-1];
                --in;
            }
            this.array[in] = temp;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
