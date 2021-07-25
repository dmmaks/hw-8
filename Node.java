public class Node<T>
{
    private T value;
    private Node next;
    private Node prev;

    public Node()
    {
        next = null;
        prev = null;
    }

    public Node(T value)
    {
        this();
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getPrev()
    {
        return prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }
}
