class RecursionBasics {
    // print nth fibonacci element 
    public static int fib(int n) {
        if (n==0 || n==1){   
            return n;
        }

        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibn= fib1 + fib2;

        return fibn;
    }

    // check if array is sorted or not
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length-1) return true;

        if (arr[i] > arr[i+1]) return false;

        return isSorted(arr, i+1);
    }

    public static void main(String args[]) {

        // int n = 9;
        // System.out.println(fib(n));

        int[] arr = {1, 2, 0, 4, 5};
        System.out.println(isSorted(arr, 0));

    }
}