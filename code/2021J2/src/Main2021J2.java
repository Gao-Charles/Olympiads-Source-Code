import java.util.*;
public class Main2021J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bidders = in.nextInt();
        int temp = 0;

        ArrayList<String> bid = new ArrayList<String>();
        ArrayList<String> bidPeople = new ArrayList<String>();
        ArrayList<String> bidAmount = new ArrayList<String>();

        while (in.hasNextLine()) {
            bid.add(in.nextLine());
        }

        bid.remove(0);

        bidPeople.addAll(bid);
        bidAmount.addAll(bid);

        for (int i = 0; i < bid.size(); i++) {
            if (i % 2 != 0) {
                bidPeople.remove(bid.get(i));
            } else {
                bidAmount.remove(bid.get(i));
            }
        }

        String[] bidAmountString = new String[bidAmount.size()];
        bidAmountString = bidAmount.toArray(bidAmountString);

        int[] bidAmountInt = Arrays.stream(bidAmountString).mapToInt(Integer::parseInt).toArray();

        for (int x = 0; x < bidders; x++) {
            for (int y = x + 1; y < bidders; y++) {

                if (bidAmountInt[x] == bidAmountInt[y]) {
                    temp = bidAmountInt[x];
                    bidAmountInt[x] = bidAmountInt[y];

                    if (y == bidders - 1) {
                        String[] bidPeopleString = new String[bidPeople.size()];
                        bidPeopleString = bidPeople.toArray(bidPeopleString);

                        System.out.println(bidPeopleString[x]);

                        break;
                    }
                }

                if (bidAmountInt[x] > bidAmountInt[y]) {
                    temp = bidAmountInt[x];
                    bidAmountInt[x] = bidAmountInt[y];
                    bidAmountInt[y] = temp;

                    if (y == bidders - 1) {
                        String[] bidPeopleString = new String[bidPeople.size()];
                        bidPeopleString = bidPeople.toArray(bidPeopleString);

                        System.out.println(bidPeopleString[x]);

                        break;
                    }
                }
            }
        }
    }
}




