import java.util.Arrays;
import java.util.Scanner;

public class Board {
    final static char[][] INITIAL_GRID = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    public static String status = "Still playing";
    static char[][] grid = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};


    public static void getMark() {
        char mark = 'z';
        char charAvailable = 'z';

        Scanner scanner = new Scanner(System.in);

        //filter to accept only characters 'a' to 'i'
        while (mark != 'a' && mark != 'b' && mark != 'c' &&
                mark != 'd' && mark != 'e' && mark != 'f' &&
                mark != 'g' && mark != 'h' && mark != 'i') {
            try {
                System.out.println("Choose the letter in the space where you want to place your next 'X'.");
                String userInput = scanner.nextLine();

                mark = scanner.next().charAt(0);
            } catch (Exception e) {
                System.out.println("You can only type a letter from 'a' to 'i'");
            }
        }
        //Check if chosen space is "empty" and assign 'X' if so.
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (INITIAL_GRID[i][j] == mark) {
                    charAvailable = grid[i][j];
                    if (charAvailable == 'X')
                        System.out.println("You have already used that space.");
                    else if (charAvailable == 'O')
                        System.out.println("I am using that space. Don't cheat!");
                    else grid[i][j] = 'X';
                }
            }
        }
    }
    public static void think() {}
    public static void setMark() {
        if (grid == INITIAL_GRID) {
            grid[0][0] = 'X';
        }
    }
    public static void graph() {
        System.out.println(Arrays.deepToString(grid));
        }
    public static void checkStatus () {
        //checks if grid is still "empty"
        if (((Arrays.binarySearch(grid, 'O')) == -1) &&
                ((Arrays.binarySearch(grid, 'X')) == -1))
            status = "Still playing";
        else if
            //checks horizontal wining
            ((grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]) ||
            (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) ||
            (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) ||
            //checks vertical wining
            (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0]) ||
            (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2]) ||
            (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2]) ||
            //checks diagonal wining
            (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) ||
            (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]))
            status = "Someone won";
        else
            status = "Still playing";
    }
}
