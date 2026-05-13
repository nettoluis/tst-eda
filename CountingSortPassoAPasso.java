import java.util.*;

class CountingSortPassoAPasso {
    public static String imprimir(int[] v) {
        String saida = "";
        for (int i = 0; i < v.length; i++) {
            saida += i ==0 ? v[i] : " " + v[i];
        }

        return saida;
    }
    public static void countingSort(int[] a, int k) {
        int[] c = new int[k+1];
        int[] b = new int[a.length];

        //freq
        for (int i = 0; i < a.length; i++) {
            c[a[i]] += 1;
            System.out.println(imprimir(c));
        } 

        //cumulative
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
        
        String saida = "";
        for (int i = 0; i < c.length; i++) {
            saida += " " + c[i];
        }
        System.out.printf("Cumulativa do vetor de contagem -%s\n", saida);

        for (int i = a.length-1; i >= 0; i--) {
            b[--c[a[i]]] = a[i];
        }

        saida = "";
        for (int i = 0; i < c.length; i++) {
            saida += i != 0 ? " " + c[i] : c[i];
        }

        System.out.println(saida);

        saida = "";
        for (int i = 0; i < b.length; i++) {
            saida += i != 0 ? " " + b[i] : b[i];
        }

        System.out.println(saida);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];
            int k = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            countingSort(n, k);
        }
    }
}
