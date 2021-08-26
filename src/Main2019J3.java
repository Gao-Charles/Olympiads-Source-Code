import java.util.*;
public class Main2019J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {

            String inputLine = in.nextLine();
            char previousChar = inputLine.charAt(0);

            int count = 1;
            String OutString = "";
//System.out.println(inputLine);
//System.out.println(inputLine.length());
            for (int j = 1; j < inputLine.length(); j++) {


                if (inputLine.charAt(j) == previousChar) {
                    count = count + 1;
                    if (j==(inputLine.length()-1)){
                        OutString = OutString +  Integer.toString(count)+previousChar;
                    }

                }
                else {
                    OutString = OutString +  Integer.toString(count)+previousChar;
                    previousChar = inputLine.charAt(j);
                    count = 1;
                }
            } //End For

            System.out.println(OutString);
        } // End For [Line]
    }
}