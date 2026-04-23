import java.util.*;

class InsertionSortRecursivo {
    public static void swap(int[] s, int i1, int i2) {
        s[i1] = s[i1] ^ s[i2];
        s[i2] = s[i1] ^ s[i2];
        s[i1] = s[i1] ^ s[i2];
    }
    public static void insercaoOrdenada(int[] n, int i) {
            for (;i > 0; i--) {
            if (n[i-1] > n[i]) {
                swap(n, i-1, i);
            }
            else {
                return;
            }
        }
    }
    public static void insertionSort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            insercaoOrdenada(n, i);
            System.out.println(Arrays.toString(n));
        }

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            insertionSort(numeros);
        }
    }
}
