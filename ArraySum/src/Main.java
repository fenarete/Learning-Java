import java.io.*;
import java.util.*;

public class Main {

        public static void main(String[] args) {

            int sumasNegativas = 0;
            int i;
            int j;
            int k;

            Scanner scan = new Scanner(System.in);
            int largo = scan.nextInt();
            int[] arreglo = new int [largo];
            for (i = 0; i <= largo-1; i++)
                arreglo[i] = scan.nextInt();

            for (j = 0 ; j <= largo -1; j++){
                for (k = 0; k <= largo -1; k++){
                    int[] subArreglo = Arrays.copyOfRange(arreglo, j, k);
                    System.out.println(Arrays.toString(subArreglo));
                }
            }
        }
    }
