import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the no = ");
        int b = sc.nextInt();

        System.out.print("Entre the no = ");
        int p = sc.nextInt();

        int r = 1;

        for (int i = 1 ; i <= p ; i++) {
            r *= b;
        }
             System.out.print("output  =  " + r);
    }
}