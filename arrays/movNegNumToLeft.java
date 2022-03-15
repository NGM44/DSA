package arrays;

public class movNegNumToLeft {
   public static void main(String[] args){
       int[] nums={0,32,43,-2,-3,1,-4};
       sortArrayByParity(nums);
        for (int i : nums) {
            System.out.println(i);
        }
   } 

   public static int[] sortArrayByParity(int[] nums) {
    int start=0;
   int end=0;
   int temp;
   while(end<nums.length){
       if(nums[end] % 2==0){
           temp=nums[end];
           nums[end]=nums[start];
           nums[start++]=temp;
       }
       end++;
   }
   return nums;
}

   public static void moveZeroes(int[] nums) {
    int start=0;
       int end=0;
       int temp;
       while(end<nums.length){
           if(nums[end]!=0){
               temp=nums[end];
               nums[end]=nums[start];
               nums[start++]=temp;
           }
           end++;
       }}

   public static void MovLargeToRight(int[] nums){
    int last =nums.length-1;  
    int max=nums[last];
      
       for(int i=nums.length-2;i>0;i--){
           if(nums[i]>max){
             int temp=nums[i];
               nums[i]=nums[last];
               nums[last]=temp;
               max=temp;
               
           }
       }
   }
   public static void MovNegNum(int[] nums){
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<0){
               if(i!=j)
               {
                   int temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }
               j++;
           }

       }
   }
}
