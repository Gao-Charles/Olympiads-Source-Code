import java.util.*;
public class Main2021J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tempDirection = "";

        while (in.hasNextLine()) {
            String instructions = in.nextLine();
            String directions = instructions.substring(0, 2);
            String steps = instructions.substring(instructions.length() - 3, instructions.length());

            String directionsString[] = directions.split(" ");
            int[] directionsInt = Arrays.stream(directionsString).mapToInt(Integer::parseInt).toArray();

            int count = directionsInt.length;

            int temp = 0;
            int quotient = 0;
            int remainder = 0;
            int total = 0;

            for (int i = 0; i < count; i++) {
                temp = directionsInt[0];
                quotient = temp / 10;
                remainder = temp % 10;
                total = quotient + remainder;
            }

            if (total == 18) {
                if (steps == "999") {
                    break;
                }
            } else if (total % 2 == 0) {
                tempDirection = "right";
                if (total == 0) {
                    System.out.println(tempDirection + " " + steps);
                } else {
                    System.out.println("right " + steps);
                }
            } else {
                tempDirection = "left";
                if (total == 0) {
                    System.out.println(tempDirection + " " + steps);
                } else {
                    System.out.println("left " + steps);
                }
            }
        }
    }
}