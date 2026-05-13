import java.util.*;
class QuickSortPassoAPasso {
    public static void quickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int indexPivot = particionamentoLomuto(v, ini, fim);
            quickSort(v, ini, indexPivot-1);
            quickSort(v, indexPivot+1, fim);
        }
    }

    public static int particionamentoLomuto(int[] v, int ini, int fim) {
        int pivot = v[ini];
        int i = ini;
        int j = i + 1;
        boolean swapped = false;

        while (j <= fim) {
            if (v[j] < pivot) {
                i++;
                swap(v, i, j);
                swapped = true;
            }
            j++;
        }

        swap(v, ini, i);
        
        String saida = "";

        for (int k = 0; k < v.length; k++) {
            saida += k == 0 ? v[k] : " " + v[k];
        }
        System.out.println(saida);

        return i;
    }

    public static void swap(int[] s, int i1, int i2) {
        int temp = s[i1];
        s[i1] = s[i2];
        s[i2] = temp;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            quickSort(numeros, 0, numeros.length-1);
        }
    }
}
