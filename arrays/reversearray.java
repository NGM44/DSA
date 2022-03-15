package arrays;

public class reversearray {
    public static void main(String[] args){
        int[] intarray={0,1,2,3,4,5,6,7,8,9}; 
        int i=0;
        int j=intarray.length-1;
        while(i<=j){
            int temp =intarray[i];
            intarray[i++]=intarray[j];
            intarray[j--]=temp;
        }
        for(int k: intarray){
            System.out.println(k);
        }
    }
}
