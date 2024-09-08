//calculate the area of the square

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        int side =  sc.nextInt();

        System.out.println("The are of the square is : " + (side*side));
        sc.close();
    }
}