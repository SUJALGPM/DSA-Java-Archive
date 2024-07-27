//Question : Find the minimum value from an array.

public class Lecture25 {
    public static void main(String []args){

        int[] arr = {12,45,78,5,9,44,56,8,10};
        int minValue = arr[0];
        int temp;
        
        System.out.println("before :"+minValue);
        for(int i=0;i<arr.length;i++){
            if(minValue < arr[i]){
                minValue = arr[i];
                System.out.println("After :"+minValue);
            }
        }
        
        System.out.println("Minimum Value of array :"+minValue);
    }
}
