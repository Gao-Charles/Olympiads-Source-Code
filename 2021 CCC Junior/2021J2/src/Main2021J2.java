import java.util.*;
public class Main2021J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bidders = Integer.parseInt(in.nextLine());

        int winnerAmount = 0;
        String winnerName = "";

        for (int i = 1; i <= bidders; i++) {
            String tempBidderName = in.nextLine();
            int tempBidderAmount = Integer.parseInt(in.nextLine());

            if (tempBidderAmount > winnerAmount) {
                winnerAmount = tempBidderAmount;
                winnerName = tempBidderName;
            }
        }

        System.out.println(winnerName);
    }
}




