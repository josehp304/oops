import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();

        for (int n = 2; n <= limit; n++) {
            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }

        sc.close();
    }
}

