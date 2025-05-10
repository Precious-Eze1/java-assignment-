public class OverloadDemo {
    public int sum(int a, int b) { return a + b; }
    public int sum(int a, int b, int c) { return a + b + c; }
    public double sum(double a, double b) { return a + b; }
    public static void main(String[] args) {
        OverloadDemo o = new OverloadDemo();
        System.out.println(o.sum(2, 3));
        System.out.println(o.sum(2, 3, 4));
        System.out.println(o.sum(2.5, 3.5));
    }
}