//average of n different numbers

import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        taking n input
        System.out.print("Enter the number of inputs :");
        int n = scan.nextInt();
        int sum = 0;
        int start = 1;
        do {
            System.out.print("Enter the " + start + " number :");
            int a = scan.nextInt();
            start ++;
            sum += a;
        }while (start <= n);

        float average = (float) (sum / n);
        System.out.println("The average of " + n + " numbers is " + average);
        scan.close();
    }
}