public class MyHashMap<K, V> {
    private SingleLinkNode[] arr;
    private int size;
    private int capacity;

    public MyHashMap() {
        this.arr = new SingleLinkNode[10];
        size = 0;
        capacity = 10;
    }

    public void put (K key, V value) {
        int hash = key.hashCode() % capacity;
        if (arr[hash] == null) {
            arr[hash] = new SingleLinkNode<K, V>(key, value);
            size++;
        }
        else if (this.get(key) == null) {
            SingleLinkNode node = arr[hash];
            while (node.getNext() != null)
            {
                node = node.getNext();
            }
            node.setNext(new SingleLinkNode<K, V>(key, value));
            size++;
        }
    }

    public V get (K key) {
        int hash = key.hashCode() % capacity;
        SingleLinkNode searched = arr[hash];
        if (searched != null)
        {
            do {
                if (searched.getKey() == key) {
                    return (V) searched.getValue();
                }
                searched = searched.getNext();
            } while (searched.getNext() != null);
        }
        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode() % capacity;
        if (arr[hash] == null) {
            return;
        }
        if (arr[hash].getKey() == key) {
            arr[hash] = arr[hash].getNext();
            size--;
            return;
        }
        SingleLinkNode searched = arr[hash];
        do {
            if (searched.getNext().getKey() == key) {
                searched.setNext(searched.getNext().getNext());
                size--;
                return;
            }
            searched = searched.getNext();
        } while (searched.getNext() != null);
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = null;
        }
    }

    public int size() {
        return size;
    }
}
