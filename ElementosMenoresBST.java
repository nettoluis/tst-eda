import java.util.*;

class ElementosMenoresBST {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            int k = Integer.parseInt(sc.nextLine());

            System.out.println(bst.preOrder());

            System.out.println(bst.elementosMenores(k));
        }
    }
}

class BST {
    private Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int v) {
        Node newNode = new Node(v);

        if (this.isEmpty()) {
            this.root = newNode;
        } else {
            Node aux = this.root;

            while (aux != null) {
                if (aux.v < v) {
                    if (aux.right == null) {
                        aux.right = newNode;
                        return;
                    } else {
                        aux = aux.right;
                    }
                } else {
                    if (aux.left == null) {
                        aux.left = newNode;
                        return;
                    } else {
                        aux = aux.left;
                    }
                }
            }
        }
    }

    public int elementosMenores(int v) {
        return elementosMenores(this.root, v);
    }

    private int elementosMenores(Node node, int v) {
        if (node == null) return 0;
        if (node.v >= v) return elementosMenores(node.left, v);
        else return 1 + elementosMenores(node.left,v) + elementosMenores(node.right, v);
    }

    public String preOrder() {
        List<String> vals = new ArrayList<>();
        preOrder(this.root, vals);
        return "[" + String.join(", ", vals) + "]";
    }

    private void preOrder(Node node, List<String> vals) {
        if (node != null) {
            vals.add(String.valueOf(node.v));
            preOrder(node.left, vals);
            preOrder(node.right, vals);
        }
    }
}

class Node {
    Node left;
    Node right;
    Node parent;
    int v;

    public Node(int v) {
        this.v = v;
    }
}

