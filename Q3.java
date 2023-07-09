import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        int maxLen = 0;

        // Count the frequency of each number
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        // Check for harmonious subsequence
        for (int num : nums) {
            if (numFreq.containsKey(num + 1)) {
                int currLen = numFreq.get(num) + numFreq.get(num + 1);
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Q3 solution = new Q3();
        int result = solution.findLHS(nums);
        System.out.println("Result: " + result);
        // Output: Result: 5
    }
}