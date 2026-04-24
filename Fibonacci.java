import java.util.*;

class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine());

            System.out.println(fibonacci(n));
        }
    }
}
