import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        texto = scanner.nextLine().toLowerCase();

        for (int i = 0; i < texto.length() / 2; i++) {
            String char1 = texto.substring(i, i + 1);
            String char2 = texto.substring(texto.length() - i - 1, texto.length() - i);
            if (char1.equals(char2))
                System.out.println("Es palindromo");
            else
                System.out.println("No es palindromo");
        }
    }
}
