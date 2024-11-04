import java.util.Scanner;

class Armstrong {
    public static boolean checkArmstrong(int num) {
        int check_num = 0;
        int actual_num = num;
        while (actual_num > 0) {
            check_num += Math.pow((actual_num % 10), 3);
            actual_num /= 10;
        }
        System.out.println(check_num);
        if (num == check_num) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (checkArmstrong(number)) System.out.println(number + " is an ArmStrong numbers");
        else System.out.println(number + " is not an Armstrong numbers");

    }
}