import java.util.*;

class InserePrimeiro {
    public static void swap(int[] s, int i1, int i2) {
        s[i1] = s[i1] ^ s[i2];
        s[i2] = s[i1] ^ s[i2];
        s[i1] = s[i1] ^ s[i2];
    }
    public static void insercaoOrdenada(int[] s, int j) {
        for (int i = j;i < s.length-1; i++) {
            if (s[i] > s[i+1]) {
                swap(s, i, i+1);
            }
            else {
                return;
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            insercaoOrdenada(numeros, 0);

            System.out.println(Arrays.toString(numeros));
        }
    }
}
