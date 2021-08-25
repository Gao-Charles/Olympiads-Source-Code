import java.util.*;

public class MainH10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int question = Integer.parseInt(in.nextLine());
        int pairs = Integer.parseInt(in.nextLine());

        String[] A = in.nextLine().split(" ");
        String[] B = in.nextLine().split(" ");

        int[] A1 = Arrays.stream(A).mapToInt(Integer::parseInt).toArray();
        int[] B1 = Arrays.stream(B).mapToInt(Integer::parseInt).toArray();

        //		System.out.println(Arrays.toString(A1));

        Arrays.sort(A1);
        Arrays.sort(B1);

        int minN = 0;
        int temp = pairs - 1;

        if (question == 1) {
            for (int i = 0; i < pairs; i++) {

                minN = minN + Integer.max(A1[i], B1[i]);

            }//end for
        }//end if
        else if (question == 2) {
            for (int i = 0; i < pairs; i++) {

                minN = minN + Integer.max(A1[i], B1[temp - i]);
            }//end for
        }//end if

        System.out.println(minN);

    }
}
