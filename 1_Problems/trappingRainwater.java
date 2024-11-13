public class trappingRainwater {
    public static int waterlevel(int array[]) {
        int n = array.length;

        // left max boundary
        int left_bound[] = new int[n];
        left_bound[0] = array[0];
        for (int i = 1; i < n; i++) {
            left_bound[i] = Math.max(array[i], left_bound[i - 1]);
        }
        // right max boundary
        int right_bound[] = new int[n];
        right_bound[n - 1] = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_bound[i] = Math.max(array[i], right_bound[i + 1]);
        }

        // calculate the waterlevel
        int trapped_water = 0;
        
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left_bound[i], right_bound[i]);

            trapped_water += waterlevel - array[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int array[] = {4, 2, 0, 6, 3, 2, 5};
        int maxlevel = waterlevel(array);

        if (maxlevel == -1) {
            System.out.println("error");
        }
        else {
            System.out.println("The max water can be trapped is " + maxlevel);
        }
    }
}