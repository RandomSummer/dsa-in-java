// calculating without factorial
import java.util.Scanner;

class factorial {
    public static int calculate(int n) {
        int fact = 1;
        if (n == 0)
            return 1;
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = calculate(n);
        System.out.println("The factorial of " + n + " is " + fact);
    }
}