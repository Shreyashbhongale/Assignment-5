import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the value of n = ");
        int n = sc.nextInt();

        double s = 0.0;

        for (int i =1 ; i <= n ; i++) {
            s += 1.0/i;

        }    
            System.out.print("sum of the series = "+ s);
        
    }
}