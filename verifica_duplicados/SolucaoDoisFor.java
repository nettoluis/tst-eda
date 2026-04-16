import java.util.Scanner;

class SolucaoDoisFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();

        String[] strings = linha.split( );

        int[] numeros = new int[strings.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);
    }
