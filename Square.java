import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre the value of n = ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i =1 ; i <= n ; i++) {
            sum = sum + (i*i);
        }  
        System.out.print("sum of square of 1st 5 no= " + sum);  
    }

}