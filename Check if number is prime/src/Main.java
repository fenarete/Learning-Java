import java.util.Scanner;

public class Main {
        public static void main(String [] args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number: ");
                long number = scanner.nextLong();
                System.out.println(checkPrime(number));
        }
        private static boolean checkPrime(long number) {
                if (number == 0 || number == 1){
                        return false;
                }
                if (number == 2){
                        return true;
                }
                for (long i = 2; i <= number / 2; i++){
                        if(number % i == 0){
                                return false;
                        }
                }
                return true;
        }
}