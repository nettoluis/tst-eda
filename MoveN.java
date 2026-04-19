import java.util.*;

class MoveN {
    public static void move(int[] s, int j) {
        for (int i = j; i > 0; i--) {
            if (s[i] < s[i-1]) {
                s[i] = s[i] ^ s[i-1];
                s[i-1] = s[i] ^ s[i-1];
                s[i] = s[i] ^ s[i-1];
                System.out.println(Arrays.toString(s));
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < numeros.length;i++) {
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
