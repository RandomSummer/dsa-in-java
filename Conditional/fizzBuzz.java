import java.util.Scanner;

class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (n % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (n % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(n);
            }
        }
        sc.close();
    }
}