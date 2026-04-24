import java.util.*;

class Encontra {
    public static String encontraPrimeiroNegativoRecursivo(int[] n, int i) {
        if (i == n.length) {
            return "-";
        }
        if (n[i] < 0) {
            return Integer.toString(n[i]);
        }

        return encontraPrimeiroNegativoRecursivo(n, i+1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                 numeros[i] = Integer.parseInt(sequencia[i]);
            }

            String saida = encontraPrimeiroNegativoRecursivo(numeros, 0);

            System.out.println(saida);
        }
    }
}
