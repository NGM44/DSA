package arrays;
// Input: nums = [-4,-1,0,3,10]

// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].

public class squareSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        squareSortedArray(nums);
    }

    public static void squareSortedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index =  nums.length - 1;

        int[] arr = new int[nums.length];
        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq <= rightsq) {
                arr[index--] = rightsq;
                right--;
            } else {
                arr[index--] = leftsq;
                left++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

}

// while(left<=right){
// int leftsq=nums[left]*nums[left];
// int rightsq=nums[right]*nums[right];
// if(leftsq>=rightsq){
// arr[index--]=leftsq;
// left++;
// }
// else{
// arr[index--]=rightsq;
// right--;
// }
// }
