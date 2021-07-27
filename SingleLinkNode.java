public class SingleLinkNode<K ,V> {
    private K key;
    private V value;
    private SingleLinkNode next;

    public SingleLinkNode() {
        next = null;
    }

    public SingleLinkNode(K key, V value) {
        this();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public SingleLinkNode getNext() {
        return next;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }
}
