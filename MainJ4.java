import java.util.*;

public class MainJ4 {
    static String shiftString(String inputString, int n) { //=1...n


        String A=inputString.substring(0,n);
        String B=inputString.substring(n);
        String outputString = B.concat(A);
        return outputString;



    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

            String string1 = in.nextLine();
            String string2 = in.nextLine();
            String yesOrno = "no";

            //System.out.println(string1 + " " + string2);

            for (int i = 1; i <= string2.length(); i++){

                if (string1.contains(shiftString(string2, i))) {
                    yesOrno = "yes";
                    break;
                }
            }

            System.out.println(yesOrno);
    } // end main
}
