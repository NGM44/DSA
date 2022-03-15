package arrays;

public class findMaxMin {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 2, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 1, 2, 1, 1 };
        sortColors(nums);
        for (int i : nums) {
            System.out.println(i);
        }

    }

    public static void sortColors(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        int temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[mid];
                    nums[mid++] = nums[low];
                    nums[low++] = temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high--] = nums[mid];
                    nums[mid] = temp;
                    break;
            }
        }
    }
}
