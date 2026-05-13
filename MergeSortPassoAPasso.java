import java.util.*;

class MergeSortPassoAPasso {
    public static void mergeSort(int[] v, int ini, int fim) {
        String saida = "[";

        for (int i = ini; i <= fim; i++) {
            saida += i == ini ? v[i] : ", " + v[i];
        }

        saida += "]";
        System.out.println(saida);
        if (ini < fim) {
            int meio = (ini + fim) / 2;

            mergeSort(v, ini, meio);
            mergeSort(v, meio + 1, fim);

            merge(v, ini, meio, fim);
        }
    }

    public static void merge(int[] v, int ini, int meio, int fim) {
        int[] helper = new int[v.length];

        for (int c = 0; c < v.length; c++) {
            helper[c] = v[c];
        }

        int i = ini;
        int j = meio + 1;
        int k = ini;

        while (i <= meio && j <= fim) {
            if (v[i] < v[j]) {
                helper[k++] = v[i++];
            } else {
                helper[k++] = v[j++];
            }
        }

        while (i <= meio) {
            helper[k++] = v[i++];
        }

        for (int r = ini; r <= fim; r++) {
            v[r] = helper[r];
        }

        String saida = "[";

        for (int s = ini; s <= fim; s++) {
            saida += s == ini ? v[s] : ", " + v[s];
        }

        saida += "]";
        System.out.println(saida);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            mergeSort(numeros, 0, numeros.length-1);
        }
    }
}
