import java.util.*;

class Frequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String elemento = sc.nextLine();
        
        String[] sequencia = sc.nextLine().split(" ");

        int contador = 0;
        for (int i = 0; i < sequencia.length; i++) {
            if (sequencia[i].equals(elemento)) {
                contador++;
            }
        }
        
        System.out.println(contador);
    }
}
