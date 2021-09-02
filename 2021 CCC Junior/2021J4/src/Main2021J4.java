import java.util.*;
public class Main2021J4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int large = 0;
        int medium = 0;
        int misplacedLarge = 0;
        int misplacedMedium = 0;
        int mediumInLarge = 0;
        int largeInMedium = 0;

        char[] shelf = in.nextLine().toCharArray();

        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == 'L') {
                large++;
            } else if (shelf[i] == 'M') {
                medium++;
            }
        }

        for (int j = 0; j < large; j++) {
            if (shelf[j] == 'M') {
                mediumInLarge++;
                misplacedLarge++;
            } else if (shelf[j] == 'S') {
                misplacedLarge++;
            }
        }

        for (int k = large; k < large + medium; k++) {
            if (shelf[k] == 'L') {
                largeInMedium++;
                misplacedMedium++;
            } else if (shelf[k] == 'S') {
                misplacedMedium++;
            }
        }

        System.out.println(misplacedLarge + misplacedMedium - Math.min(largeInMedium, mediumInLarge));
    }
}
