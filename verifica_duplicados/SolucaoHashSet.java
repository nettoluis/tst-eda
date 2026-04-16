import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class SolucaoHashSet {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>(); 

        Scanner sc = new Scanner(System.in);
        String linha = sc.nextLine();
        String[] strings = linha.split(" "); 
        int[] numeros = new int[strings.length];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
           if (conjunto.contains(numeros[i])) {
                System.out.println("true");
                return;
           } 
           conjunto.add(numeros[i]); 
        }

        System.out.println("false");
        sc.close(); 
    }
}
