import java.util.Scanner;

public class Main {
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++)
                        System.out.print(fibonacci(i) + ", ");
        }
        public static int fibonacci(int n){
                if (n == 0)
                        return 0;
                if (n == 1 || n == 2)
                        return 1;
                else
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
}
