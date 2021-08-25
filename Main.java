import java.util.*;
//cd C:\ideaProject\out\production\2020J1
//java Main <C:\ideaProject\cccData\2020\all_data\junior_data\j1\j1.01.02.in
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
            int S = in.nextInt();
            int M = in.nextInt();
            int L = in.nextInt();




        int total = (1 * S) + (2 * M) + (3 * L);

        if (total >=10) {
            System.out.println("happy");
        }
        System.out.println("sad");

*/
        //max = (a > b) ? a : b;
        String happySad="";
        happySad=((1 * in.nextInt()) + (2 * in.nextInt()) + (3 * in.nextInt()) )>=10? "happy":"sad";
        System.out.println(happySad);
    }
}



