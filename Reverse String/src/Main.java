import java.util.Scanner;

public class Main {
    public static void main (String [] args){
            String str = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give me the string: ");
            str = scanner.next();
            System.out.println(reverse(str));
    }
    private static StringBuilder reverse (String in) {
            StringBuilder out = new StringBuilder(in);
            return out.reverse();
    }
}
