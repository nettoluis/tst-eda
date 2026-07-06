import java.util.*;

class ValorMaisProximo {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            int k = Integer.parseInt(sc.nextLine());

            System.out.println(bst.preOrder());

            System.out.println(bst.valorMaisProximo(k));
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

    public int valorMaisProximo(int v) {
        Node aux = this.root;
        int valor = aux.v;

        while (aux != null) {
            if (Math.abs(aux.v - v) < Math.abs(valor - v)) valor = aux.v;
            if (aux.v > v) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
        }

        return valor;
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
