//Question : Given an array or string, the task is to reverse the array or string.

import java.util.Arrays;

public class Lecture23 {
    public static void main(String[] args) {
        System.out.println("Hye let start new concept.");

        int[] arr = {12,45,78,5,9,44,56,8,10};

        int startIndex = 0;
        int endIndex = arr.length - 1;
        int temp;

        System.out.println(startIndex);
        System.out.println(endIndex);

        while(startIndex < endIndex){
          temp = arr[startIndex]; 
          arr[startIndex] = arr[endIndex];
          arr[endIndex] = temp;
          startIndex++;
          endIndex--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
