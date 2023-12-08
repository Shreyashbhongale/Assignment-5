

public class Fibo2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 1;
        for (int i = 0 ; count <= 10; i++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
                ++count;
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

        
        