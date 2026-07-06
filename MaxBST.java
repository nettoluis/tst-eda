import java.util.*;

class MaxBST {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            
            BST bst = new BST();
            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            System.out.println(bst.max());
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
            return;
        }

        Node aux = this.root;
        while (aux != null) {
            if (v < aux.value) {
                if (aux.left == null) {
                    aux.left = newNode;
                    newNode.parent = aux;
                    return;
                }
                aux = aux.left;
            } else {
                if (aux.right == null) {
                    aux.right = newNode;
                    newNode.parent = aux;
                    return;
                }
                aux = aux.right;
            }
        }
    }

    public String max() {
        return max(this.root);
    }

    private String max(Node node) {
        if (node.right == null) {
            return String.valueOf(node.value);
        }
        return node.value + " " + max(node.right);
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    public Node(int v) {
        this.value = v;
    }
}
