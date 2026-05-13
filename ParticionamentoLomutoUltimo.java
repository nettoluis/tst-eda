import java.util.*;

class ParticionamentoLomutoUltimo {
    public static void lomuto(int[] v, int ini, int fim) {
        int pivot = v[fim];
        int i = fim;
        int j = fim-1;

        while (j >= ini) {
            if (v[j] > pivot) {
                swap(v, --i, j);
                System.out.println(Arrays.toString(v));
            }
            j--;
        }

        swap(v, i, fim);
        System.out.println(Arrays.toString(v));
    }

    public static void swap(int[] v, int i1, int i2) {
        int temp = v[i1];
        v[i1] = v[i2];
        v[i2] = temp;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            lomuto(n, 0, n.length-1);
            System.out.println(Arrays.toString(n));
        }
    }
}
