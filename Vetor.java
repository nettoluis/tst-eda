import java.util.*;

class Vetor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int qtd = Integer.parseInt(sc.nextLine());

            String saida = "";
            for (int i = 0; i < qtd; i++) {
                saida += i == 0 ? sequencia[i%sequencia.length] : " " + sequencia[i%sequencia.length];
            }

            System.out.println(saida);
        }
    }
}
