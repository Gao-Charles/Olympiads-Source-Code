import java.util.*;

public class MainJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        int[] X= new int[count];
        int[] Y=new int[count];

        String[] coordinates = new String[2];

        for (int i = 0; i < count; i++) {
            coordinates= in.nextLine().split(",");
            X[i]=Integer.parseInt(coordinates[0]);
            Y[i]=Integer.parseInt(coordinates[1]);
        }
        Arrays.sort(X);
        Arrays.sort(Y);
      //  System.out.println(Arrays.toString(X));
     //   System.out.println(Arrays.toString(Y));
        System.out.println( (X[0]-1)+","+(Y[Y.length-1]+1));


    }
}
