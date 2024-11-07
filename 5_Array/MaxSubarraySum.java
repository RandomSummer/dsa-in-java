class MaxSubarraySum {
    public static void findMaxOfSum(int array[]) {
        int n = array.length;
        int total_subarray = n*(n+1)/2;
        int sum[] = new int[total_subarray];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]);
                }
                System.out.println(); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6};
        findMaxOfSum(array);
    }
}