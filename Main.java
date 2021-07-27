public class Main {
    public static void main(String[] args) {
        //testArrayList();
        //testLinkedList();
        //testQueue();
        //testStack();
        testMap();
    }

    public static void testArrayList() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.print();
        System.out.println("Size: " + arrayList.size());
        arrayList.remove(3);
        arrayList.print();
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element by index 3: " + arrayList.get(3));
        System.out.println("Element by index -1: " + arrayList.get(-1));
        arrayList.clear();
        arrayList.print();
        System.out.println("Size: " + arrayList.size());
    }

    public static void testLinkedList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("Element 0: " + list.get(0));
        System.out.println("Element 1: " + list.get(1));
        System.out.println("Element 2: " + list.get(2));
        System.out.println("Element 3: " + list.get(3));
        System.out.println("Element 4: " + list.get(4));
        System.out.println("Element -1: " + list.get(-1));
        System.out.println("Element 5: " + list.get(5));
        list.remove(2);
        list.print();
        System.out.println("Size: " + list.size());
        list.remove(1);
        list.print();
        System.out.println("Size: " + list.size());
        list.remove(1);
        list.print();
        System.out.println("Size: " + list.size());
        list.clear();
        list.print();
        System.out.println("Size: " + list.size());
    }

    public static void testQueue() {
        MyQueue<Integer> q = new MyQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        q.print();
        System.out.println("Peek: " + q.peek());
    }

    public static void testStack() {
        MyStack<Integer> q = new MyStack<>();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.print();
        System.out.println("Peek: " + q.peek());
        System.out.println("Pop: " + q.poll());
        q.print();
        System.out.println("Peek: " + q.peek());
    }

    public static void testMap() {
        MyHashMap<String, Integer> m = new MyHashMap<>();
        m.put("a", 1);
        m.put("b", 2);
        m.put("c", 3);
        m.put("d", 4);
        System.out.println("By key a: " + m.get("a"));
        System.out.println("By key b: " + m.get("b"));
        System.out.println("By key c: " + m.get("c"));
        System.out.println("By key d: " + m.get("d"));
        m.put("d", 5);
        System.out.println("By key d: " + m.get("d"));
        System.out.println("Size: " + m.size());
        m.remove("b");
        System.out.println("By key b: " + m.get("b"));
        System.out.println("Size: " + m.size());
        m.clear();
        System.out.println("Size: " + m.size());
    }
}
