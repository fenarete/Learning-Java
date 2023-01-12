import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c = 1;
        long count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        for (long i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
