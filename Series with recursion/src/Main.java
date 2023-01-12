import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String renglon = ("");
        Scanner scanner = new Scanner(System.in);
        short q = scanner.nextShort();
        for (short i = 1; i <= q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int acc = a;
            for (short k = 1; k <= n; k++){
                int newElement = (int)(Math.pow(2,k-1) * b);
                acc = acc + newElement;
                renglon = (renglon + acc + " " );
            }
        System.out.println (renglon);
        renglon = ("");
        }
    }
}