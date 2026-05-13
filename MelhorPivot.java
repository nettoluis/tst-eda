import java.util.*;

class MelhorPivot {
    public static int melhorPivot(int[] v, int p1, int p2) {
        int contadorP1 = 0;
        int contadorP2 = 0;

        for (int elemento : v) {
            if (elemento < v[p1]) {
                contadorP1++;
            }

            if (elemento < v[p2]) {
                contadorP2++;
            }
        }

        int diff1 = Math.abs((v.length / 2) - contadorP1);
        int diff2 =  Math.abs((v.length / 2) - contadorP2);

        return diff1 <= diff2 ? p1 : p2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");
            String[] pivots = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            int pivot1 = Integer.parseInt(pivots[0]);
            int pivot2 = Integer.parseInt(pivots[1]);

            System.out.println(melhorPivot(n, pivot1, pivot2));
        }
    }
}
