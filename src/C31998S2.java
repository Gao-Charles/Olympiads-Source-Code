import java.util.*;
public class C31998S2
{

    //method 1
    public static String cipher1(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {

            if (Character.isSpaceChar(text.charAt(i)))
                result.append(' ');
            else if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();

    }
    //method 2
    public static String cipher2(String message, int offset)
    {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                char fLetter;
                if (Character.isUpperCase(character))
                    fLetter='A';
                else
                    fLetter='a';

                int originalAlphabetPosition = character - fLetter;
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) (fLetter + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decode(String message, int offset)
    {
        return cipher2(message, 26-offset%26);

    }

    public static double calculateProbability(String decipheredMessage) {
        final double[] ENGLISH_LETTERS_PROBABILITIES = {0.073, 0.009, 0.030, 0.044, 0.130, 0.028, 0.016, 0.035, 0.074, 0.002, 0.003, 0.035, 0.025, 0.078, 0.074, 0.027, 0.003, 0.077, 0.063, 0.093, 0.027, 0.013, 0.016, 0.005, 0.019, 0.001};
        double probability = 0.000;
        for (char character : decipheredMessage.toCharArray()) {
            if (character != ' ') {

                probability +=  ENGLISH_LETTERS_PROBABILITIES[character - 'A'];
            }

        }
        // System.out.println(probability);
        return probability;
    }


    public static String  decrypt(String message) {
        double highestProb = 0.000;
        String stringDecrypted = null;
        for (int i = 0; i < 26; i++) {

            // String decipheredMessage=cipher2(message,26-((i+1)%26));
            String decipheredMessage=decode(message,i+1);
            //   System.out.println(decipheredMessage);
            double prob;

            prob = calculateProbability(decipheredMessage);

            if(prob> highestProb)
            {

                highestProb = prob;
                stringDecrypted = decipheredMessage;
            }
        }

        return stringDecrypted;
    }

    public static void main(String[] args)
    {
        //System.out.println(decode("FA NQ AD ZAF FA NQ FTMF UE FTQ CGQEFUAZ",12));
        //System.out.println(calculateProbability("THE FULL MOON RISING IS A BAD SIGN"));
        //System.out.println(decrypt("FA NQ AD ZAF FA NQ FTMF UE FTQ CGQEFUAZ"));

        Scanner in = new Scanner(System.in);
        int numLine = Integer.parseInt(in.nextLine());
        String text;
        for (int i = 0; i < numLine; i++){
            text=in.nextLine();

            //decode
            //System.out.println(cipher2(text,26-(12%26)));
            //System.out.println(decode(text,12));

            //final solution
            System.out.println(decrypt(text));

        }
    }
}

