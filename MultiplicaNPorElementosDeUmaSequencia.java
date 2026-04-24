import java.util.*;

class MultiplicaNPorElementoDeUmaSequencia {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = Integer.parseInt(sc.nextLine());

            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            for (int i = 0; i < n.length; i++) {
                n[i] *= m;
            }

            String saida = "";
            for (int i = 0; i < n.length; i++) {
                saida += i == 0 ? n[i] : " " + n[i];
            }

            System.out.println(saida);
        }
    }
}
