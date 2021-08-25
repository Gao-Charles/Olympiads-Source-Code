import java.util.*;

public class Main2019J4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] grid = {{1, 2}, {3, 4}};

        String input = in.nextLine();

        for (int j = 0; j <= input.length() - 1; j++) {

            if (input.charAt(j) == 'V') {
                int temp1 = grid[0][0];
                int temp2 = grid[0][1];

                grid[0][0] = grid[1][0];
                grid[1][0] = temp1;

                grid[0][1] = grid[1][1];
                grid[1][1] = temp2;

            } else if (input.charAt(j) == 'H') {
                int temp3 = grid[0][0];
                int temp4 = grid[1][0];

                grid[0][0] = grid[0][1];
                grid[0][1] = temp3;

                grid[1][0] = grid[1][1];
                grid[1][1] = temp4;

            }
        }


        System.out.println(grid[0][0] + " " + grid[0][1]);
        System.out.println(grid[1][0] + " " + grid[1][1]);
    }
}
