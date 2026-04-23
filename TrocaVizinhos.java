import java.util.*;

class TrocaVizinhos {
    public static void swap(int[] s, int i1, int i2) {
        s[i1] = s[i1] ^ s[i2];
        s[i2] = s[i1] ^ s[i2];
        s[i1] = s[i1] ^ s[i2];
    }
    public static void trocaVizinhos(int[] n) {
        for (int i = 0; i < n.length-1; i += 2) {
            swap(n, i, i+1);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            trocaVizinhos(n);

            System.out.println(Arrays.toString(n));
        }
    }
}
