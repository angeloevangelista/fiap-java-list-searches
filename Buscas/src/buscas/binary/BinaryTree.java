package buscas.binary;

public class BinaryTree {
    public Node root;

    public void insert(int value) {
        this.root = insertRecursively(this.root, value);
    }

    private Node insertRecursively(Node node, int value) {
        if (node == null) {
            node = new Node(value);

            return node;
        }

        if (value < node.value) {
            node.left = insertRecursively(node.left, value);
        } else if(value > node.value) {
            node.right = insertRecursively(node.right, value);
        }

        return node;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
