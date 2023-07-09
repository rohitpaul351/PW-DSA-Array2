public class Q8 {
    public int minimumScore(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // If the difference is within the range, return 0
        if (max - min <= 2 * k) {
            return 0;
        }

        // Update the maximum and minimum values
        max -= k;
        min += k;

        return max - min;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Q8 solution = new Q8();
        int result = solution.minimumScore(nums, k);
        System.out.println("Result: " + result);
        // Output: Result: 0
    }
}