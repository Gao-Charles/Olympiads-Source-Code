import java.util.*;

public class MainH5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Friends = Integer.parseInt(in.nextLine());
        int Rounds = Integer.parseInt(in.nextLine());

        int[] rounds = new int [Rounds];
        for (int i = 0; i < Rounds; i++) {
            rounds[i] = Integer.parseInt(in.nextLine());
        }

        ArrayList<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= Friends; i++) {
            friends.add(i);
        }

        for (int round: rounds){

            int friendsSize = friends.size() - 1;
            for (int i = friendsSize; i >= 0 ; i--) {
                if ((i + 1) % round == 0) {
                    friends.remove(i);
                }
            }
        }
    }
}

/*            int count = in.nextInt();

            ArrayList<Integer> friends = new ArrayList<Integer>(count);

            while(in.hasNext()) {
                int n = friends.size();
                for(int i = n; i <= 0; i--) {
                    if(i % friends.size() == 0) {
                        friends.remove(int(i))
                    }
                }
            }

            for(int j = 0; j < friends.size(); j++) {
                System.out.print(friends.get(j));
            }
        }
}
*/