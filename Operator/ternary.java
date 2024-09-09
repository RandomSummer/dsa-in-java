import java.util.Scanner;
/*This is a example of ternary operator*/
class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check whether the number is ODD/EVEN ??");
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + type + ".");
        scan.close();
    }
}