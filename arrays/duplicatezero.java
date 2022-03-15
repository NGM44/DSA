package arrays;
// Duplicate Zeros

// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

public class duplicatezero {
    public static void main(String[] args) {
        int[] intarray = { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] newarray = new int[intarray.length];
        int index = 0;
        for (int i : intarray) {
            if (index == intarray.length) {
                break;
            }
            if (i == 0) {
                newarray[index++] = i;
            }
            newarray[index++] = i;

        }
        for (int i : newarray) {
            System.out.println(i);
        }
    }
}
