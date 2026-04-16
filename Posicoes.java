import java.util.*;

class Posicoes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int elemento = Integer.parseInt(sc.nextLine());

            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            String saida = "";
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == elemento) {
                    saida += saida.equals("") ? i : " " + i;
                }
            }

            System.out.println(saida.equals("") ? -1 : saida);
        }
    }
}
