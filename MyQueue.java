public class MyQueue<T> {
    Node head;
    Node tail;
    int size;

    public MyQueue()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void print()
    {
        System.out.print("Queue contents: ");
        Node current = head;
        for (int i = 0; i < size; i++)
        {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.print("\n");
    }

    public void add(T value)
    {
        if (head == null)
        {
            this.head = new Node<T>(value);
            tail = head;
        }
        else
        {
            tail.setNext(new Node<T>(value));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
        }
        size++;
    }

    public void remove(int index)
    {
        if (index < 0 || index >= size)
        {
            return;
        }
        if (index == 0)
        {
            head = head.getNext();
            head.setPrev(null);
            size--;
            return;
        }
        Node searched = head;
        for (int i = 0; i < index; i++)
        {
            searched = searched.getNext();
        }
        searched.getPrev().setNext(searched.getNext());
        if (searched.getNext() != null)
        {
            searched.getNext().setPrev(searched.getPrev());
        }
        else
        {
            tail = searched.getPrev();
        }
        size--;
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

    public T peek()
    {
        return (T) head.getValue();
    }

    public T poll()
    {
        T result = (T) head.getValue();
        this.remove(0);
        size--;
        return result;
    }
}
