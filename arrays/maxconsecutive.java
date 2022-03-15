package arrays;

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

public class maxconsecutive {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOne(array));
    }

    public static int findMaxConsecutiveOne(int[] array) {
        int count = 0;
        int max = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
