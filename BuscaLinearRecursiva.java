import java.util.*;

class BuscaLinearRecursiva {
    public static int buscaLinearRecursiva(int[] n, int e, int i) {
        if (i >= n.length) {
            return -1;
        }
        if (n[i] == e) {
            return i;
        }
        return buscaLinearRecursiva(n, e, i+1);

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            int e = Integer.parseInt(sc.nextLine());

            System.out.println(buscaLinearRecursiva(n, e, 0));
        }
    }
}
