package buscas.binary;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;

        left = null;
        right = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (left != null) {
            sb.append(left);
        }

        sb.append(value).append(" ");

        if (right != null) {
            sb.append(right);
        }

        return sb.toString();
    }
}
