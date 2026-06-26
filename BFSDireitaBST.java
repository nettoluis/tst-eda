import java.util.*;

class BFSDireitaBST {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            BST bst = new BST();

            for (int i = 0; i < s.length; i++) {
                bst.add(Integer.parseInt(s[i]));
            }

            System.out.println(bst.bfsDireita());
        }
    }
}

class BST {
    Node root;
    int size;

    public BST() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int value) {
        size++;
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

    public String bfsDireita() {
        if (this.isEmpty()) return "";

        Fila fila = new Fila(this.size);
        String saida = "";


        fila.addLast(this.root);
        while (!fila.isEmpty()) {
            Node current = fila.removeFirst();
            saida += saida.equals("") ? current.value + "" : " " + current.value;

            if (current.right != null) fila.addLast(current.right);
            if (current.left != null) fila.addLast(current.left);
        }

        return saida;
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

class Fila {
    private Node[] array;
    private int head;
    private int tail;
    private int size;

    public Fila(int size) {
        this.array = new Node[size];
        this.size = size;
        this.head = -1;
        this.tail = -1;
    }

    public boolean isEmpty() {
        return this.head == -1 || this.head == size;
    }

    public void addLast(Node value) {
        if (this.isEmpty()) {
            this.head = 0;
            this.tail = 0;
            array[this.tail] = value;
            return;
        } else {
            array[++this.tail] = value;
        }
    }

    public Node removeFirst() {
        return array[this.head++];
    }
}
