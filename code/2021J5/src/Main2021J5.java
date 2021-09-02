import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main2021J5 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(input.readLine());
        int columns = Integer.parseInt(input.readLine());
        int count = Integer.parseInt(input.readLine());

        boolean[] rowSwipes = new boolean[rows + 1];
        boolean[] columnSwipes = new boolean[columns + 1];

        for (int i = 0; i < count; i++) {
            String[] line = input.readLine().split(" ");
            int index = Integer.parseInt(line[1]);

            if (line[0].equals("R")) {
                rowSwipes[index] = !rowSwipes[index];
            } else {
                columnSwipes[index] = !columnSwipes[index];
            }
        }
        input.close();

        boolean[][] canvas = new boolean[rows + 1][columns + 1];

        for (int i = 1; i <= rows; i++) {
            if (rowSwipes[i]) {
                for (int j = 1; j <= columns; j++) {
                    canvas[i][j] = !canvas[i][j];
                }
            }
        }

        for (int i = 1; i <= columns; i++) {
            if (columnSwipes[i]) {
                for (int j = 1; j <= rows; j++) {
                    canvas[j][i] = !canvas[j][i];
                }
            }
        }

        int goldCount = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (canvas[i][j]) {
                    goldCount++;
                }
            }
        }
        System.out.println(goldCount);
    }
}