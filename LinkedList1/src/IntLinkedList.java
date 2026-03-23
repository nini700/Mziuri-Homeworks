public class IntLinkedList {


    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node head;
    private Node tail;
    private int size;

    private Node nodeAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("ინდექსი: " + index + ", ზომა: " + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("ინდექსი: " + index + ", ზომა: " + size);
        }
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    public int get(int index) {
        checkElementIndex(index);
        return nodeAt(index).value;
    }


    public int set(int index, int value) {
        checkElementIndex(index);
        Node node = nodeAt(index);
        int oldValue = node.value;
        node.value = value;
        return oldValue;
    }

    public int getFirst() {
        if (isEmpty()) throw new java.util.NoSuchElementException("სია ცარიელია");
        return head.value;
    }

    public int getLast() {
        if (isEmpty()) throw new java.util.NoSuchElementException("სია ხარიელია");
        return tail.value;
    }

    public void add(int value) {
        addLast(value);
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void add(int index, int value) {
        checkPositionIndex(index);
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node prev = nodeAt(index - 1);
            Node node = new Node(value);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public int removeFirst() {
        if (isEmpty()) throw new java.util.NoSuchElementException("სია ცარიელია");
        int value = head.value;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return value;
    }

    public int removeLast() {
        if (isEmpty()) throw new java.util.NoSuchElementException("სია ცარიელია");
        int value = tail.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node prev = nodeAt(size - 2);
            prev.next = null;
            tail = prev;
        }
        size--;
        return value;
    }

    public int remove(int index) {
        checkElementIndex(index);
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        Node prev = nodeAt(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public boolean removeValue(int value) {
        if (isEmpty()) return false;
        if (head.value == value) {
            removeFirst();
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                if (current.next == tail) tail = current;
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        tail = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int count(int value) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.value == value) count++;
            current = current.next;
        }
        return count;
    }

    public boolean equals(IntLinkedList other) {
        if (this.size != other.size) return false;
        Node a = this.head;
        Node b = other.head;
        while (a != null) {
            if (a.value != b.value) return false;
            a = a.next;
            b = b.next;
        }
        return true;
    }
}