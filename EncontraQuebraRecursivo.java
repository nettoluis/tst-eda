import java.util.*;

class EncontraQuebraRecursivo {
    public static int encontraQuebraRecursivo(int[] n, int i) {
        if (i == n.length) {
            return -1;
        }
        if (n[i] < n[i-1]) {
            return i;
        }

        return encontraQuebraRecursivo(n, i+1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                 numeros[i] = Integer.parseInt(sequencia[i]);
            }

            System.out.println(encontraQuebraRecursivo(numeros, 1));
        }
    }
}
