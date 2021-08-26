import org.xml.sax.ext.Locator2;

import java.util.*;

public class MainH7B {
    public static String getLastWord(String sentence) {//split

        String[] splitArray = sentence.split(" ");
        String lastWord = splitArray[splitArray.length - 1];

        return(lastWord);

    }

    public static String getLastsyllable(String lastWord) { //charAt

        lastWord = lastWord.toLowerCase();
        String Output = "";

        for(int i = lastWord.length() - 1; i >= 0; i--) {
            char character = lastWord.charAt(i);

            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

                Output = lastWord.substring(i);
            }
        }

        if (Output.equals(""))
            Output = lastWord;

        return (Output);
    }

    public static void main(String[] args) {

        System.out.println(getLastsyllable("trmp"));

        System.out.println();
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for(int i = 1; i <= n; i++){

            String L1 = in.nextLine();
            String L2 = in.nextLine();
            String L3 = in.nextLine();
            String L4 = in.nextLine();

            L1 = getLastWord(L1);
            L1 = getLastsyllable(L1);

            L2 = getLastWord(L2);
            L2 = getLastsyllable(L2);

            L3 = getLastWord(L3);
            L3 = getLastsyllable(L3);

            L4 = getLastWord(L4);
            L4 = getLastsyllable(L4);


            if (L1.equals(L2) && L2.equals(L3) && L3.equals(L4)) {
                System.out.println("perfect");
            }

            else if (L1.equals(L2) && L3.equals(L4)) {
                System.out.println("even");
            }

            else if(L1.equals(L3) && L2.equals(L4)) {
                System.out.println("cross");
            }

            else if(L1.equals(L4) && L2.equals(L3)) {
                System.out.println("shell");

            }

            else {
                System.out.println("free");
            }
        }
    }//end main
}

