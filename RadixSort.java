import java.util.*;

class RadixSort {
    public static int[] countingSort(int[] a, int d) {
        int[] c = new int[10];
        int[] b = new int[a.length];
        int operando = (int) Math.pow(10, d);

        //freq
        for (int i = 0; i < a.length; i++) {
            c[(a[i] % operando) / (operando / 10)] += 1;
        } 

        //cumulative
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }
        
        //sort
        for (int i = a.length-1; i >= 0; i--) {
            b[--c[(a[i] % operando) / (operando / 10)]] = a[i];
        }

        return b;
    }

    public static void radixSort(int[] v, int d) {
        for (int i = 1; i <= d; i ++) {
            v = countingSort(v, i);
            System.out.println(Arrays.toString(v));
        }


    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];
            int d = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            radixSort(n, d);
        }
    }
}
