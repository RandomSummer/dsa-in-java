import java.util.Scanner;

class binomialCoff {
    public static int factorial(int n) {
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
    public static int binoCoeff(int n, int r) {
            int n_fact = factorial(n);
            int r_fact = factorial(r);
            int nmr_fact = factorial(n - r);
            int binCoeff = n_fact / (nmr_fact * r_fact);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int bino = binoCoeff(N, R);
        System.out.println(bino);
    }
}