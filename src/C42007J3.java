import java.util.*;
public class C42007J3{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int[] moneyArray = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        int totalMoney = Arrays.stream(moneyArray).sum();
        //System.out.println(totalMoney);//1691600
        int a = scan.nextInt();
        int openedMoney=0;
        for (int i=0;i<a;i++) {

            openedMoney+=moneyArray[scan.nextInt()-1];
        }

        int offerMoney=scan.nextInt();
     //   System.out.println((totalMoney-openedMoney)/8);
        if ((totalMoney-openedMoney)/(10-a)<offerMoney)
            System.out.println("deal");
        else
            System.out.println("no deal");

        int[] aa = { 2, 4, 5, 6, 7, 3, 2 };

        System.out.println(Arrays.toString(aa));
    }//end of main
}