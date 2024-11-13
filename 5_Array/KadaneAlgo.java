public class KadaneAlgo {
    public static void Kadane(int array[]) {
        int n = array.length - 1;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i<n; i++) {
            
            currsum = currsum+array[i] < 0 ? currsum + 0 : currsum + array[i]; 

            if (maxsum < currsum) maxsum = currsum;
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane(array);
    }
}