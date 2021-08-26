import java.util.*;

public class MainStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine());
        int size, latestCar, neededCar;

        Stack<Integer> mountainCars = new Stack<Integer>();
        Stack<Integer> branchCars = new Stack<Integer>();

        for(int i = 0; i < count; i++) {

            size = in.nextInt();

            for(int j = 0; j < size; j++) {
                mountainCars.push(in.nextInt());
            }



            latestCar = 0;
            neededCar = 1;

            while(true) {
//System.out.println(latestCar);
                if(latestCar == size) {
                    break;
                }
                else {

//System.out.println(mountainCars);
                    //   System.out.println(branchCars);
                    //   System.out.println("");

                    if(!mountainCars.empty()  && mountainCars.peek() == neededCar) {
                        mountainCars.pop();
                        latestCar = neededCar;
                        neededCar++;

                        //     System.out.println(mountainCars);
                        //      System.out.println(branchCars);
                        //     System.out.println("");
                    }
                    else if(!branchCars.empty() && branchCars.peek() == neededCar) {
                        branchCars.pop();
                        latestCar = neededCar;
                        neededCar++;

                        //    System.out.println(mountainCars);
                        //   System.out.println(branchCars);
                        //  System.out.println("");
                    }
                    else if(mountainCars.empty() == false ) {
                        branchCars.push(mountainCars.pop());


                        //   System.out.println(mountainCars);
                        //  System.out.println(branchCars);
                        //  System.out.println("");
                    }
                    else {
                        break;
                    }
                } //End Else
            } //End While

            if(latestCar == size) {
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        } //End For
    }
}
