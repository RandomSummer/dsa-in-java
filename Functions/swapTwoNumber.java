class swapTwoNumber{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping :");
        System.out.println("a ::" + a + " b ::" + b);
    }
    public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 2;
        System.out.println("Before swap :");
        System.out.println("a = " + a + " b = " + b);
        swap(a, b);
    }
}