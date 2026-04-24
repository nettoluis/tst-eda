import java.util.*;

class SelectionSortPassoAPasso {
    public static boolean isSorted(int[] n) {
        for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static int retornaIMenor(int[] n, int inicio) {
        int iMenor = inicio;
        for (int i = inicio; i < n.length; i++) {
            if (n[i] < n[iMenor]) {
                iMenor = i;
            }
        }

        return iMenor;
    }

    public static void swap(int[] s, int i1, int i2) {
        int temp = s[i1];
        s[i1] = s[i2];
        s[i2] = temp;
    }

    public static void selectionSort(int[] n) {
        int ordenados = 0;
        do {
            int iMenor = retornaIMenor(n, ordenados);
            swap(n, ordenados++, iMenor);
            System.out.println(Arrays.toString(n));
        } while (!isSorted(n));
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(" ");

            int[] n = new int[s.length];

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }

            selectionSort(n);
        }
    }
}
