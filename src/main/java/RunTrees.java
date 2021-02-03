import java.util.ArrayList;

public class RunTrees {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Tree tree = createTree();
            tree.displayTree();
            System.out.println("________________________");
        }
    }
    public static Tree createTree() {
        Tree tree = new Tree((int)(Math.random() * 200 - 100));
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random() * 200 - 100);
            tree.insert(a);
        }
        return tree;
    }
}
