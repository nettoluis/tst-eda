import java.util.*;

class SomaFolhasBST {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            System.out.println(bst.somaFolhas());
        }
    }
}

class BST {
    Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.isEmpty()) {
            this.root = newNode;
            return;
        } else {
            Node aux = this.root;
            while (aux != null) {
                if (value < aux.value) {
                    if (aux.left == null) {
                        aux.left = newNode;
                        newNode.parent = aux;
                        break;
                    } else {
                        aux = aux.left;
                    }
                } else {
                    if (aux.right == null) {
                        aux.right = newNode;
                        newNode.parent = aux;
                        break;
                    } else {
                        aux = aux.right;
                    }
                }
            }
        }
    }

    public int somaFolhas() {
        if (this.isEmpty()) {
            return 0;
        } else {
            return somaFolhas(this.root);
        }
    }

    private int somaFolhas(Node node) {
        if (node == null) return 0;
        if (node.isLeaf()) {
            return node.value;
        } else {
            return somaFolhas(node.left) + somaFolhas(node.right);
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }
}
