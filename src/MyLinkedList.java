import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

    private int size;
    private Node head;
    private Node tail;

    private void add(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void addLast(T data) {
        add(data);
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            add(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + " size: " + size);
    }

    public void add(int index, T data) {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size - 1) {
            addLast(data);
            return;
        }

        Node cursor = head;
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = cursor;
            cursor = cursor.next;
        }
        Node newNode = new Node(data);
        previous.next = newNode;
        newNode.next = cursor;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        Node cursor = head;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        return cursor.data;
    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(size - 1);
    }

    public T remove(int index) {
        checkIndex(index);
        --size;
        if (index == 0) {
            head = head.next;
            return head.data;
        }
        Node cursor = head;
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = cursor;
            cursor = cursor.next;
        }
        Node removed = cursor;
        if (index == size - 1) {
            previous.next = null;
            tail = previous;
        } else {
            previous.next = cursor.next;
        }

        return removed.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T>{

        Node cursor = head;

        @Override
        public boolean hasNext() {
            return cursor.next != null;
        }

        @Override
        public T next() {
            Node current = cursor;
            cursor = cursor.next;
            return current.data;
        }
    }
    private class Node {
        T data; // используемые данные
        Node next = null; // ссылка на сл элемент
        public Node(T data) {
            this.data = data;
        }
    }


}
