 class SingleLinkedList<T> {
    private Node<T> head;

    public SingleLinkedList() {
        this.head = null;
    }

     public void setHead(Node<T> head) {
         this.head = head;
     }

     public Node<T> getHead() {
         return head;
     }

     public boolean isEmpty() {
        return head == null;
    }
    public void push(T t) {
        Node<T> n = new Node(t);
        n.setNext(head);
        head = n;
    }
    public Node<T> pop() {
        if (isEmpty()) return null;
        Node<T> temp = head;
        head = head.getNext();
        return temp;
    }
    public boolean contains(T t) {
        Node<T> n = new Node<T>(t);
        Node<T> current = head;
        while (!current.equals(n)) {
            if (current.getNext() == null)  {
                return false;
            }
            else {
                current = current.getNext();
            }
        }
        return true;
    }
    public void delete(T t) {
        Node<T> n = new Node<T>(t);
        Node<T> current = head;
        Node<T> previous = null;
        while (!current.equals(n)) {
            if (current.getNext() == null) {
                return;
            }
            else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == head) {
            head = head.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        // return current.c
    }

     public Iterator getIterator(SingleLinkedList list) {
         return new Iterator(this);
     }
}
