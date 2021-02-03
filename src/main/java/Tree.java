class Tree {
    private int value;
    private Tree left;
    private Tree right;
    private Tree root;

    public Tree(int value) {
        this.value = value;
    }

    public void insert(int value) {
        Tree node = new Tree(value);
        if (root == null) {
            root = node;
        } else {
            Tree current = root;
            Tree parent;
            while (true) {
                parent = current;
                if (value < current.value) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else if (value > current.value) {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void preOrderTraverse(Tree currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode);
            preOrderTraverse(currentNode.left);
            preOrderTraverse(currentNode.right);
        }
    }
    public void displayTree() {
        preOrderTraverse(root);
    }

    @Override
    public String toString() {
        return String.format("Node(%s)", value);
    }
}
