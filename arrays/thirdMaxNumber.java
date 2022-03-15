package arrays;

import java.util.HashSet;

public class thirdMaxNumber {
    public static void main(String[]args){
        int[] intarray={0,1,2,3,4,5,6,7,8,9}; 
        System.out.println(thirdMax(intarray));
       
    }


    public static int thirdMax(int[] nums) {
        int largest = Integer.MIN_VALUE;
           int Second_largest = Integer.MIN_VALUE;
           int third_largest = Integer.MIN_VALUE;
           
           HashSet<Integer> set = new HashSet<Integer>();
           for(int num : nums)
           {
               set.add(num);
               if(largest<num)
               {
                   third_largest = Second_largest;
                   Second_largest = largest;
                   largest = num;
               }
                   
               if(Second_largest<num && num<largest)
               {
                   third_largest = Second_largest;
                   Second_largest = num;
               }
       
               if(third_largest<num && num<Second_largest && num<largest)
               {
                   third_largest = num;
               }
           }
           if(set.size() < 3)
               return largest;
           return third_largest;
        }         
}
