import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String firstWord = scanner.nextLine();
            String secondWord = scanner.nextLine();

            firstWord = firstWord.toLowerCase();
            secondWord = secondWord.toLowerCase();

            char[] chA = firstWord.toCharArray();
            char[] chB = secondWord.toCharArray();

            sort(chA, 0, firstWord.length()-1);
            sort(chB, 0, secondWord.length()-1);

            System.out.println(Arrays.equals(chA,chB) ? "Anagrams" : "Not Anagrams");
        }
    }
