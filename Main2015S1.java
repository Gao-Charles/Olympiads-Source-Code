import java.util.*;
import java.util.stream.Stream;

public class Main2015S1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Stack<Integer> statements = new Stack<Integer>();

        int output = 0;

        for (int i = 1; i <= n; i++) {
            int j = in.nextInt();

            if (j != 0) {
                statements.push(j);
                output = output + j;
            } else {
                output = output - (statements.pop());
            }


        }

        /* int sum = 0;

        Iterator iterator = statements.iterator();

        while(iterator.hasNext()){

            int value = (int)iterator.next();
            sum+=value;

        } */

        //sum = inputTotal - popTotal;

        System.out.println(output);
    }
}