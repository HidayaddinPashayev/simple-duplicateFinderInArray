package ArrayListLinkedList;

class DoublyLinkedList {


    static class Node {
        int value;
        Node prev;
        Node next;


        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // elave etmek
    public void add(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head= newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // goturmek
    public int get(int index) {
        if (index < 0 || index >= size) ;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    // silmek
    public void remove(int index) {
        if (index < 0 || index >= size);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
    }

    // print etmek
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
