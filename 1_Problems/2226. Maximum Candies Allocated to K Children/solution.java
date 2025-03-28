import java.util.Arrays;

class MaxCandies {
    // Function to find the maximum number of candies that can be distributed among k children
    // such that each child gets equal number of candies and the number of candies is maximum.

    public static int maximumCandies(int[] candies, long k) {
        int l = 1;
        int r = (int) (Arrays.stream(candies).asLongStream().sum() / k);

        while (l < r) {
        final int m = (l + r) / 2;
        if (numChildren(candies, m) < k)
            r = m;
        else
            l = m + 1;
        }

        return numChildren(candies, l) >= k ? l : l - 1;
    }

    private static long numChildren(int[] candies, int m) {
        return Arrays.stream(candies).asLongStream().reduce(0L, (subtotal, c) -> subtotal + c / m);
    }
    public static void main(String[] args) {
        long k = 3;
        int[] candies = {5, 8, 6};

        System.out.println("Output :: " + maximumCandies(candies, k));
    }
}
