
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value number: ");	
	int num = sc.nextInt();
        int fact = 1;

        while (num > 0) {
            fact = fact * num;
            num = num - 1;
        }

        System.out.println("Factorial is: " + fact);
    }
}

