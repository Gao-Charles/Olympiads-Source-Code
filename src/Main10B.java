import java.util.*;

public class Main10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maximum = Integer.parseInt(in.nextLine());
        int time = 0;
        int counter = 0;

        ArrayList<Integer> choreTimes = new ArrayList<>();

        while(in.hasNextLine()) {
            choreTimes.add(in.nextInt());
        }

        // System.out.println(maximum);
        // System.out.println(choreTimes);

        Integer[] choreTimes2 = new Integer[choreTimes.size()];

        for (int n = 0; n < choreTimes.size(); n++) {
            choreTimes2[n] = choreTimes.get(n);
        }

        for(int i = 0; i < choreTimes.size(); i++) {
            time = time + choreTimes2[i];

            if(maximum >= time) {
                counter++;
            }
            else {
                break;
            }
        }

        System.out.println(counter);
    }
}