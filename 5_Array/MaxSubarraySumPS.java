public class MaxSubarraySumPS {
    public static void PrefixSum(int array[]) {
        int n = array.length;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int prefix[] = new int[n];

        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                curr_sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
                
                    if(max_sum < curr_sum) {
                        max_sum = curr_sum;
                    }
                }
            }
            System.out.println(max_sum);
        }
        

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        PrefixSum(array);
    }
}