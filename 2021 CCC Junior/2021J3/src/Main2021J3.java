import java.util.*;
public class Main2021J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String instructions = in.nextLine();

            int total = 0;
            String temp = "";

            if (instructions.equals("99999")) {
                break;
            } else {
                int directions = Integer.parseInt(instructions.substring(0, 2));
                String steps = instructions.substring(instructions.length() - 3, instructions.length());

                total = (directions / 10) + (directions % 10);

                if (total % 2 == 1) {
                    System.out.println("left " + steps);
                    temp = "left";
                } else if (total % 2 == 0) {
                    System.out.println("right " + steps);
                    temp = "right";
                } else {
                    System.out.println(temp + " " + steps);
                }
            }
        }
    }
}
