import java.util.*;
public class Main2021J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pressure = in.nextInt();

        int boilTemp = 5 * pressure - 400;

        System.out.println(boilTemp);

        if (boilTemp < 100) {
            System.out.println("1");
        } else if (boilTemp == 100) {
            System.out.println("0");
        } else
            System.out.println("-1");
    }
}