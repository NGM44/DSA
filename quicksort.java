public class quicksort {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
      int[] intarray={20,35,-15,1,55,7,-12};
      quicksort(intarray,0,intarray.length);
      for(int i=0;i<intarray.length;i++){
          System.out.println(intarray[i]);
      }
    }
    public static void quicksort(int[] intarray,int start,int end){
        if(end-start<2){
            return;
        }
        int pivotIndex=partition(intarray,start,end);
        quicksort(intarray,start,pivotIndex);
        quicksort(intarray,pivotIndex+1,end);
    }
    public static int partition(int[] input, int start,int end){
        int pivot=input[start];
        int i=start;
        int j=end;
        while(i<j){
            while(i<j && input[--j]>=pivot);
            if(i<j){
                input[i]=input[j];
            }
             while(i<j && input[++i]<=pivot);
            if(i<j){
                input[j]=input[i];
            }
        }
        input[j]=pivot;
        return j;
    }
    

}
