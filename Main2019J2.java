import java.util.*;
public class Main2019J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());

        ArrayList<String> input = new ArrayList<>(count);

        while(in.hasNextLine()) {
            String[] message = in.nextLine().split(" ");

            int amount = Integer.parseInt(message[0]);
            String character = message[1];

            ArrayList<String> output = new ArrayList<>();

            for(int i = 1; i <= amount; i++) {
                output.add(character);
            }

            String ArrayToString = String.join(", ", output);
            String Output = ArrayToString.replaceAll(", ", "");
            System.out.println(Output);
        }
    }
}
