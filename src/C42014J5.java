import java.util.*;
public class C42014J5 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String[] X=scan.nextLine().split(" ");
        String[] Y=scan.nextLine().split(" ");
        //System.out.println(Arrays.toString(X));
       // System.out.println(Arrays.toString(Y));

        String goodOrbad="good";
        for (int i=0;i<n;i++){
            String A=X[i];
            String B=Y[i];
            if (A.equals(B)){
                goodOrbad="bad";
                break;
            }
            else{
                if (Arrays.asList(Y).indexOf(A)!=Arrays.asList(X).indexOf(B)){
                    goodOrbad="bad";
                    break;
                }
            }
        }
        System.out.println(goodOrbad);
    }//END MAIN
}
