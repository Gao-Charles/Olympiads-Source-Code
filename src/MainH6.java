import java.util.*;
public class MainH6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> coordinates = new ArrayList<>();

        coordinates.add("0 -1");
        coordinates.add("0 -2");
        coordinates.add("0 -3");
        coordinates.add("1 -3");
        coordinates.add("2 -3");
        coordinates.add("3 -3");
        coordinates.add("3 -4");
        coordinates.add("3 -5");
        coordinates.add("4 -5");
        coordinates.add("5 -5");
        coordinates.add("5 -4");
        coordinates.add("5 -3");
        coordinates.add("6 -3");
        coordinates.add("7 -3");
        coordinates.add("7 -4");
        coordinates.add("7 -5");
        coordinates.add("7 -6");
        coordinates.add("7 -7");
        coordinates.add("6 -7");
        coordinates.add("5 -7");
        coordinates.add("4 -7");
        coordinates.add("3 -7");
        coordinates.add("2 -7");
        coordinates.add("1 -7");
        coordinates.add("0 -7");
        coordinates.add("-1 -7");
        coordinates.add("-1 -6");
        coordinates.add("-1 -5");

        int currentX = -1;
        int currentY = -5;
        String safeOrDanger = "safe";

        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");

            String direction = line[0];

            if (direction.equals("q")) {
                break;
            }

            int steps = Integer.parseInt(line[1]);

            for (int i = 0; i < steps; i++) {


                switch (direction) {
                    case "d":
                        currentY = currentY - 1;
                        break;
                    case "u":
                        currentY = currentY + 1;
                        break;
                    case "l":
                        currentX = currentX - 1;
                        break;
                    case "r":
                        currentX = currentX + 1;
                        break;
                }

                if (coordinates.contains(currentX + " " + currentY)) {
                    safeOrDanger = "DANGER";

                } else {

                    if (!safeOrDanger.equals("DANGER")) {
                        coordinates.add(currentX + " " + currentY);
                        safeOrDanger = "safe";
                    }

                }

                coordinates.add(currentX + " " + currentY);


            }//end for

            if (safeOrDanger.equals("DANGER")) {
                System.out.println(currentX + " " + currentY + " " + safeOrDanger);
                break;
            }
            System.out.println(currentX + " " + currentY + " " + safeOrDanger);

        }//end while


    }//end main
}