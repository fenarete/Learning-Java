import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        String fraseOriginal;
        String fraseSinEspacios;
        StringBuilder fraseSinEspaciosInvertida = new StringBuilder();
        String fraseInvertida;
        boolean esPalindromo = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la frase Original ");
        fraseOriginal = scanner.nextLine();
        fraseSinEspacios = fraseOriginal.replaceAll("\s","");
        fraseSinEspaciosInvertida.append(fraseSinEspacios);
        fraseSinEspaciosInvertida.reverse();
        fraseInvertida = fraseSinEspaciosInvertida.toString();

        if (fraseInvertida.equals(fraseSinEspacios))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");

        System.out.println(fraseInvertida);
        System.out.println(fraseSinEspacios);
    }
}
