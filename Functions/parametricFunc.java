import java.util.Scanner;

class parametricFunc {
    public static int calculateSum(int a, int b) {
        int sum = a + b; // here sum is local scope
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = calculateSum(num1, num2); //here sum is global scope
        System.out.println("Sum of " + num1 + " and " + num2 + " :: " + sum);
    }
}