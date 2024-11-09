class MaxSubarraySum {
    public static void findMaxOfSum(int array[]) {
        int n = array.length;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(array[k]);
                    // if (i == 0 && j == n-1 && array[k] > 0) {    // wrong technique as it is printing max sum not of a subarray (only max sum possible of an array)
                    //     sum += array[k];
                    // }
                    curr_sum += array[k];
                    if(max_sum < curr_sum) {
                        max_sum = curr_sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        int array[] = {2, -3, 2, 5, -4};
        findMaxOfSum(array);
    }
}