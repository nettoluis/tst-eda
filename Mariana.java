import java.util.*;

class Mariana {
    public static void insercaoOrdenada(String[] s, int i) {
        for (; i > 0; i--) {
            if (s[i].compareTo(s[i-1]) <= 0) {
                String temp = s[i];
                s[i] = s[i-1];
                s[i-1] = temp;
            }
        }
    }
    public static String constroiSaida(String[] s) {
        String saida = "";
        for (int i = 0; i < s.length; i++) {
            saida += i == 0 ? s[i] : ", " + s[i];
        }

        return saida;
    }

    public static void insertionSort(String[] s) {
            System.out.println(constroiSaida(s));
        for (int i = 1; i < s.length;i++) {
            insercaoOrdenada(s, i);
            System.out.println(constroiSaida(s));
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] s = sc.nextLine().split(",");

            insertionSort(s);
        }
    }
}
