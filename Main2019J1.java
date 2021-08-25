import java.util.*;
public class Main2019J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int apple3 = in.nextInt();
        int apple2 = in.nextInt();
        int apple1 = in.nextInt();
        int banana3 = in.nextInt();
        int banana2 = in.nextInt();
        int banana1 = in.nextInt();

        int appleTotal = 3 * apple3 + 2 * apple2 + apple1;
        int bananaTotal = 3 * banana3 + 2 * banana2 + banana1;

        if(appleTotal > bananaTotal) {
            System.out.println("A");
        }

        else if(appleTotal < bananaTotal) {
            System.out.println("B");
        }

        else {
            System.out.println("T");
        }
    }
}