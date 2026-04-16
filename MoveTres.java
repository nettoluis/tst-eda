import java.util.*;

class MoveTres {
    public static void move(int[] sequencia, int j) {
        for (int i = j; i > 0; i--) {
            if (sequencia[i-1] > sequencia[i]) {
                sequencia[i-1] = sequencia[i-1] ^ sequencia[i];
                sequencia[i] = sequencia[i-1] ^ sequencia[i];
                sequencia[i-1] = sequencia[i-1] ^ sequencia[i];
            } else {
                break;
            }
            System.out.println(Arrays.toString(sequencia));
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < numeros[i-1]) {
                    move(numeros, i);                    
                }
            }

        }
    }
}
