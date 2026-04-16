import java.util.*;

class Encontra {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                 numeros[i] = Integer.parseInt(sequencia[i]);
            }

            String saida = "-";
            for (int numero : numeros) {
                if (numero < 0) {
                   saida = Integer.toString(numero); 
                   break;
                }
            }

            System.out.println(saida);
        }
    }
}
