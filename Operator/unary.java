import java.util.Scanner;

class unary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("The post-increment number is ::" + n++);
        System.out.println("The pre-increment number is ::" + ++n);


    }
}