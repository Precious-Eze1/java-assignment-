public class AverageCalculator {
    public static double average(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum / 5.0;
    }
    public static void main(String[] args) {
        int[] nums = {70, 80, 90, 85, 75};
        System.out.println("Avg: " + average(nums));
    }
}