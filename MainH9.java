import java.util.*;

public class MainH9 {
    public static int GCD(int a, int b) {

        if(b == 0) {
            return a;
        }
        else {
            return GCD(b, (a % b));
        }

    }

    public static void main(String[] args) {

        int a = 135;
        int b = 95;
        a = GCD(a, b);

        System.out.println("The GCD is " + a);
    }
}
