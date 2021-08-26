import java.util.*;

public class Main2006J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<Character, Integer> keyTime = new HashMap<Character, Integer>();

        keyTime.put('a', 1);
        keyTime.put('b', 2);
        keyTime.put('c', 3);
        keyTime.put('d', 1);
        keyTime.put('e', 2);
        keyTime.put('f', 3);
        keyTime.put('g', 1);
        keyTime.put('h', 2);
        keyTime.put('i', 3);
        keyTime.put('j', 1);
        keyTime.put('k', 2);
        keyTime.put('l', 3);
        keyTime.put('m', 1);
        keyTime.put('n', 2);
        keyTime.put('o', 3);
        keyTime.put('p', 1);
        keyTime.put('q', 2);
        keyTime.put('r', 3);
        keyTime.put('s', 4);
        keyTime.put('t', 1);
        keyTime.put('u', 2);
        keyTime.put('v', 3);
        keyTime.put('w', 1);
        keyTime.put('x', 2);
        keyTime.put('y', 3);
        keyTime.put('z', 4);

        HashMap<Character, Integer> keyPad = new HashMap<Character, Integer>();

        keyPad.put('a', 2);
        keyPad.put('b', 2);
        keyPad.put('c', 2);
        keyPad.put('d', 3);
        keyPad.put('e', 3);
        keyPad.put('f', 3);
        keyPad.put('g', 4);
        keyPad.put('h', 4);
        keyPad.put('i', 4);
        keyPad.put('j', 5);
        keyPad.put('k', 5);
        keyPad.put('l', 5);
        keyPad.put('m', 6);
        keyPad.put('n', 6);
        keyPad.put('o', 6);
        keyPad.put('p', 7);
        keyPad.put('q', 7);
        keyPad.put('r', 7);
        keyPad.put('s', 7);
        keyPad.put('t', 8);
        keyPad.put('u', 8);
        keyPad.put('v', 8);
        keyPad.put('w', 9);
        keyPad.put('x', 9);
        keyPad.put('y', 9);
        keyPad.put('z', 9);

        int pause = 2;


        String inputLine = "";

        while(true) {
           inputLine = in.nextLine();

            //System.out.println(inputLine);

            if(inputLine.equals("halt")) {
                break;
            }
            else {
                int totalSeconds = 0; //Local Variables that change during calculation must be reset between input denominations
                char preChar = ' ';
                char currentChar = ' ';

                for(int i = 0; i < inputLine.length(); i++) {
                    currentChar = inputLine.charAt(i);

                    //System.out.println(currentChar);

                    totalSeconds = totalSeconds + keyTime.get(currentChar);

                   if(keyPad.get(currentChar) == keyPad.get(preChar) && preChar != ' ') {
                        totalSeconds += pause;
                    }

                    preChar = currentChar;
                }//end for
                System.out.println(totalSeconds);

            } //end else
        }//End While
    }
}