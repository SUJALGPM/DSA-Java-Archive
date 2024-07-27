//Question : Given an array of integers, return an array with even integers removed.

import java.util.Arrays;

public class Lecture21 {

    //Handle to print array values...
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /***************************Handle to remove even integer values from array is the TASK...*******************************/

    //METHOD-1...
    // public void removeEvenInteger(){
    //     int [] arr = {78,23,5,12,77,9,6,1,2,4,88};

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]%2 !=0){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }

    //METHOD-2...
    public void removeEvenInteger(){
        int oddValues = 0;
        int[] arr = {3,2,4,7,10,6,5};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                // System.out.println(arr[i]);
                oddValues++;
            }
        }

        int[] newOddArray = new int[oddValues];
        int newIdx = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newOddArray[newIdx] = arr[i];
                newIdx++;
            }
        }

        System.out.println(Arrays.toString(newOddArray));
    }

    //Handle class main method...
    public static void main(String[] args) {
        System.out.println("hey we start new concept...");
        Lecture21 lec = new Lecture21();

        lec.removeEvenInteger();

    }
}
