import java.util.*;

class PredecessorBST {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            int k = Integer.parseInt(sc.nextLine());

            System.out.println(bst.predecessor(k));
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

    public Node search(int value) {
        if (this.isEmpty()) {
            return null;
        } else {
            Node aux = this.root;

            while (aux != null) {
                if (aux.value == value) return aux;
                if (value < aux.value) {
                    aux = aux.left;
                } else {
                    aux = aux.right;
                }
            }

            return null;
        }
    }

    private String max(Node node) {
        String saida = "";
        while (node.right != null) {
            saida += node.value + ", ";
            node = node.right;
        }

        return saida + node.value;
    }

    public String predecessor(int value) {
        Node node = this.search(value);
        if (node == this.root && node.isLeaf()) {
            return "[" + value + "]";
        }
        String saida = "";
        if (node == null) {
            throw new RuntimeException("Valor não presente na BST");
        }

        if (node.left != null) {
            saida += value + ", ";
            saida += max(node.left);
        } else {
            Node aux = node.parent;
            saida += value;

            while (aux != null) {
            saida += ", " + aux.value;
            if (aux.value < value) break;
            aux = aux.parent;
            }
        }

        return "[" + saida + "]";
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
