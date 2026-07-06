import java.util.*;

class AlturaBST {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            System.out.println(bst.height());
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
    
    public int height() {
        return this.height(this.root);
    }
    
    private int height(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
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
