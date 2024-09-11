import java.util.Scanner;

class vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age ::");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can vote.");
        }
        else {
            System.out.println("You are under age, cannot vote.");
        }
        scan.close();
    }
}