import java.util.*;

class InsereUltimo {
    public static void swap(int[] s, int i1, int i2) {
        s[i1] = s[i1] ^ s[i2];
        s[i2] = s[i1] ^ s[i2];
        s[i1] = s[i1] ^ s[i2];
    }
    public static void insercaoOrdenada(int[] s, int i) {
        for (; i > 0; i--) {
            if (s[i-1] > s[i]) {
                swap(s, i, i-1);
            }
            else {
                break;
            }
        } 
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            insercaoOrdenada(numeros, numeros.length-1);

            System.out.println(Arrays.toString(numeros));
        }
    }
}
