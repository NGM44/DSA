public class countingsort {
    public static void main(String[] args) {
        int[] intarray={2,3,1,4,10,5,2,6,8,4};
       countSort(intarray,1,10);
       for(int i=0;i<intarray.length;i++){
           System.out.println(intarray[i]);
       }
     }
     
     public static void countSort(int[] input, int min,int max){
         int[] countarray=new int [(max-min)+1] ;
          for(int i=0;i<input.length;i++){
           countarray[input[i]-min]++;
       }
       int j=0;
       for(int i=min;i<=max;i++){
           while(countarray[i-min]>0){
               input[j++]=i;
               countarray[i-min]--;
           }
       }
     }
}
