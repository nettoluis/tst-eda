import java.util.*;

class EstatisticaOrdem {
    public static int estatisticaOrdem(int[] v, int i) {
        int pivot = v[i];
        int contador = 1;

        for (int elemento : v) {
            if (elemento < pivot)
                contador++;
        }

        return contador;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            System.out.println(estatisticaOrdem(n, 0));
        }
    }
}
