import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("lower : ");
        int l = sc.nextInt();

        System.out.print("upper : ");
        int u = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
         for (  c = a+b ; c<=u; c = a+b) {
                if (c >= l) {
                    System.out.println(c);
                }
               
                a = b;
                b = c;

                }
        }   
    }
