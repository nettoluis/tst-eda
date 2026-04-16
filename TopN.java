import java.util.*;

class TopN {
    public static int[] mergeSort(int[] a) {
        int[] primeiraMetade = Arrays.copyOfRange(a, 0, a.length/2);
        int[] segundaMetade = Arrays.copyOfRange(a, a.length/2, a.length-1);

        mergeSort(primeiraMetade);
        mergeSort(segundaMetade);

        return merge(primeiraMetade, segundaMetade);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int idc = 0;

        while (a.length != 0 && b.length != 0) {
            if (a[0] < b[0]) {
                c[idc] = a[0];
                a = Arrays.copyOfRange(a,1, a.length-1);
                idc++;
            } else {
                c[idc] = b[0];
                b = Arrays.copyOfRange(b, 1, b.length-1);
                idc++;
            }
        }

        while (a.length != 0) {
            c[idc] = a[0];
            a = Arrays.copyOfRange(a, 1, a.length-1);
            idc++;
        }


        while (b.length != 0) {
            c[idc] = b[0];
                b = Arrays.copyOfRange(b, 1, b.length-1);
            idc++;
        }

        return c;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] sequencia = sc.nextLine().split(" ");

            int[] numeros = new int[sequencia.length];

            for (int i = 0; i < sequencia.length; i++) {
                numeros[i] = Integer.parseInt(sequencia[i]);
            }

            int n = Integer.parseInt(sc.nextLine());

            numeros = mergeSort(numeros);

            String saida = "";
                for (int i = numeros.length-1; i >= 0; i--) {
                saida += saida.equals("") ? numeros[i] : " " + numeros[i];
            }

            System.out.println(saida);
        }
    }
}
