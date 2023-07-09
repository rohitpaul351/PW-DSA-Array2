import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;

        Set<Integer> uniqueCandyTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);
        }

        return Math.min(uniqueCandyTypes.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Q2 solution = new Q2();
        int result = solution.distributeCandies(candyType);
        System.out.println("Result: " + result);
        // Output: Result: 3
    }
}
