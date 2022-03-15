package arrays;

// Example : Input: nums = [555,901,482,1771]

// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.

public class findevenNumbers {
    public static void main(String[] args) {
        int[] numarray = { 555, 901, 482, 1771, 555, 901, 482, 1771 };
        int count = 0;
        int num = 0;
        for (int i : numarray) {
            System.out.println(i);
            while (i > 0) {
                i = i / 10;
                num++;
            }
            if (num % 2 == 0) {
                count++;

            }
            num = 0;
        }
        System.out.println(count);
    }

}
