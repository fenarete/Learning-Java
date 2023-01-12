import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gimme 'a' and 'b': ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            swapNumbers(a, b);
    }
    private static void swapNumbers(int a, int b) {
            b = b + a;
            a = b - a; // 'a' has 'b''s original value
            b = b - a; // 'b' is still de sum of original 'a' and original 'b', but 'a' now is further 'b', so...
            System.out.println("a is " + a + " b is " + b);
        }
}
