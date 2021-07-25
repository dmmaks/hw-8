public class MyHashMap<K, V> {
    private SingleLinkNode head;
    private SingleLinkNode tail;
    private int size;

    public MyHashMap()
    {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void put (K key, V value)
    {
        if (head == null)
        {
            head = new SingleLinkNode<K, V>(key, value);
            tail = head;
            size++;
        }
        else if (this.get(key) == null)
        {
            tail.setNext(new SingleLinkNode<K, V>(key, value));
            tail = tail.getNext();
            size++;
        }
    }

    public V get (K key)
    {

        SingleLinkNode searched = head;
        for (int i = 0; i < size; i++)
        {
            if (searched.getKey() == key)
            {
                return (V) searched.getValue();
            }
            searched = searched.getNext();
        }
        return null;
    }

    public void remove(K key)
    {
        if (head == null)
        {
            return;
        }
        if (head.getKey() == key)
        {
            head = head.getNext();
            size--;
            return;
        }
        SingleLinkNode searched = head;
        for (int i = 0; i < size - 1; i++)
        {
            if (searched.getNext().getKey() == key)
            {
                searched.setNext(searched.getNext().getNext());
                size--;
                return;
            }
            searched = searched.getNext();
        }
    }

    public void clear()
    {
        size = 0;
        head = null;
    }

    public int size()
    {
        return size;
    }
}
