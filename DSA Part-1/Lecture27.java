//Question : Given an array of integers, return max || 2nd max || 3rd max value.

public class Lecture27 {
    public static void main(String[] args) {
        
        int[] arr = {12,45,78,5,9,44,56,78,8,10,96};
        int max = arr[0];
        int secondMax = 0;
        int thirdMax = 0;

        for(int i =0;i<arr.length;i++){
            if(max < arr[i]){
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            }else if(secondMax < arr[i] && max > arr[i]){
                thirdMax = secondMax;
                secondMax = arr[i];
            }else if(thirdMax < arr[i] && secondMax > arr[i]){
                thirdMax = arr[i];
            }
        }
        
        System.out.println("Max value :"+max);
        System.out.println("Second Max value :"+secondMax);
        System.out.println("Third Max value :"+thirdMax);
    }
}
