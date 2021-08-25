import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int People = in.nextInt();
        int InitialN = in.nextInt();
        int Rate = in.nextInt();
        int Day = 0;
        int Total = 0;
        int CurrentN = 0;

        while (People >= Total) {

            CurrentN = InitialN * Rate;
            Total = Total + InitialN;
            ++Day;
            InitialN = CurrentN;
        }

        System.out.println(Day);
    }
}
