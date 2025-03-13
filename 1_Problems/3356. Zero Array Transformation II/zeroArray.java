class zeroArray {
    public static int minZeroArray(int[] nums, int[][] queries) {
          int[] line = new int[nums.length + 1];
          int decrement = 0;
          int k = 0;
      
          for (int i = 0; i < nums.length; ++i) {
            while (decrement + line[i] < nums[i]) {
              if (k == queries.length)
                return -1;
              final int l = queries[k][0];
              final int r = queries[k][1];
              final int val = queries[k][2];
              ++k;
              if (r < i)
                continue;
              line[Math.max(l, i)] += val;
              line[r + 1] -= val;
            }
            decrement += line[i];
          }
      
          return k;
        }
    
        public static void main(String[] args) {
          int[] arr = {2,0,2};
          int[][] queries = {{0,2,1},{0,2,1},{1,1,3}};
    
          System.out.println("Output :: " + minZeroArray(arr, queries));
    }
  }
