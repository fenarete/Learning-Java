import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main (String [] args){
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            System.out.println(checkVowel(string));
        }
    private static boolean checkVowel(String input) {
            return input.toLowerCase(Locale.ROOT).matches(".*[aeiou].*");
    }
}
