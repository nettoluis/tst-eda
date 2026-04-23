import java.util.*;

class SelectionSortRecursivo {
    public static void swap(int[] n, int i1, int i2) {
        int temp = n[i1];
        n[i1] = n[i2];
        n[i2] = temp;
    }

    public static int encontrarIDoMenor(int[] n, int inicio) {
        int menor = n[inicio];
        int iMenor = inicio;
        for (int i = inicio; i < n.length; i++) {
            if (n[i] <= menor) {
                menor = n[i];
                iMenor = i;
            }
        }

        return iMenor;
    }

    public static void selectionSort(int[] n) {
        int ordenados = 0;

        for (int i = ordenados; i < n.length-1; i++) {
            int iMenor = encontrarIDoMenor(n, i);
            swap(n, ordenados, iMenor);
            ordenados++;
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

            selectionSort(numeros);
        }
    }
}
