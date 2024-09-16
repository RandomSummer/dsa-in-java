class Demo {

    static int count = 0;
    static String str = "This is a static message.";
    static int total = 0;

    int score;

    public Demo(int i) {
    }

    void Counter(int score) {
        count++;
        this.score = score;
        total += score;
    }

    static void func() {
        System.out.println("Number of objects created: " + count);
        System.out.println("Common Message: " + str);
        System.out.println("Total Score of all objects: " + total);
    }
}

public class test {
    public static void main(String[] args) {
        Demo obj1 = new Demo(50);
        Demo obj2 = new Demo(70);
        Demo obj3 = new Demo(30);

        Demo.func();

        System.out.println("Access static variables directly:");
        System.out.println("Total objects created: " + Demo.count);
        System.out.println("Static message: " + Demo.str);
        System.out.println("Combined score of all objects: " + Demo.total);
    }
}