class Iterator<T> {
    private Node<T> current;
    private Node<T> previous;
    private SingleLinkedList<T> list;

    public Iterator(SingleLinkedList<T> list) {
        this.list = list;
    }

    public void reset() {
        current = list.getHead();
    }

    public void next() {
        current = current.getNext();
    }


    public Node<T> getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return current.getNext() == null;
    }

    public void insertBefore(T t) {
        Node<T> node = new Node<>(t);
        node.setNext(previous.getNext());
        previous.setNext(node);
        current = node;
    }

    public void insertAfter(T t) {
        Node<T> node = new Node<>(t);
        node.setNext(current.getNext());
        current.setNext(node); ;
        next();
    }

//    public String deleteCurrent(){
//
//    }

}


// reset() +
// next() +
// getCurrent() +
// atEnd() +
// insertBefore();
// insertAfter();
// deleteCurrent();
