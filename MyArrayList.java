public class MyArrayList<T> {
    private T[] arr;
    private int capacity;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[5];
        capacity = 5;
        size = 0;
    }

    public void print() {
        System.out.print("ArrayList contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public void resize() {
        T[] new_arr = (T[]) new Object[capacity * 2];
        System.arraycopy(arr, 0, new_arr, 0, arr.length);
        this.arr = new_arr;
        capacity *= 2;
    }

    public void add(T value) {
        if (size == capacity) {
            this.resize();
        }
        arr[size] = value;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index >= 0 && index < size)
            return arr[index];
        return null;
    }
}
