import java.util.Objects;

 class Node<T> {
    private T t;
    private Node<T> next;

    public Node(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return String.format("Node(c=%s)", t);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(t, node.t) &&
                Objects.equals(next, node.next);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

