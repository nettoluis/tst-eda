import java.util.*;

class CountingSortNegativoPassoAPasso {
    public static void countingSort(int[] a, int k, int l) {
        int[] c = new int[k-l+1];
        int[] b = new int[a.length];

        //freq
        for (int i = 0; i < a.length; i++) {
            c[a[i]-l]++;
            System.out.println(Arrays.toString(c));
        }
        
        //cumulative
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
        System.out.printf("Cumulativa do vetor de contagem - %s\n",Arrays.toString(c));

        //sort
        for (int i = a.length-1; i >= 0; i--) {
            b[--c[a[i]-l]] = a[i];
        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];
            int k = Integer.parseInt(sc.nextLine());
            int l = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            countingSort(n, k, l);
        }
    }
}
