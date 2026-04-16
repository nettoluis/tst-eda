import java.util.*;

class Tres {
    public static int contaSequencia(long n) {
        int contador = 1;
        while (n != 1) {
            n = (n % 2 == 0) ? (n / 2) : ((3 * n) + 1);
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int inicio = Math.min(i, j);
            int fim = Math.max(i, j);
            int tamanhoMaximo = 0;

            for (int atual = inicio; atual <= fim; atual++) {
                int tamanhoAtual = contaSequencia(atual);
                if (tamanhoAtual > tamanhoMaximo) {
                    tamanhoMaximo = tamanhoAtual;
                }

            }
            System.out.println(tamanhoMaximo);
        }
    }
}
