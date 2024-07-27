//Given an array of n-1 distinct number in the range of 1 to n. Find the missing number in it.

import java.util.Arrays;

public class Lecture32 {

    //Method -1 to solve problem...
    public void Test1(int[] arr) {
        int minValue = arr[0];
        int maxValue = arr[0];
        int totalGross = 0;
        int temp = 0;

        //Fetch min and max value...
        for(int i=0;i<arr.length;i++){

            //Find minimum value...
            if(minValue > arr[i]){
                minValue = arr[i];
            }
            
            //Find maximum value...
            else if(maxValue <arr[i]){
                maxValue = arr[i];
            }
        }

        //Fetch total n number from min to max...
        for(int i=minValue;i<=maxValue;i++){
            totalGross += i; 
        }

        //Actual array total...
        for(int i=0;i<arr.length;i++){
            temp += arr[i];
        }

        System.out.println("Actual Array :"+Arrays.toString(arr));
        System.out.println("Actual Array length  :"+arr.length);
        System.out.println("Minimum value of array :"+minValue);
        System.out.println("Maximum value of array :"+maxValue);
        System.out.println("Correct 1 to 8 n number of Total :"+totalGross);
        System.out.println("Incorrect 1 to 8 n number of Total :"+temp);
        System.out.println("Missing Value from above array is  :"+(totalGross - temp));
    }
    
    //Method -2 to solve problem...
    public void Test2(int[] arr){
        int size = arr.length + 1;

        //Calculate total using formula...
        int totalGross = size * (size + 1)/2;

        for(int value : arr){
            totalGross = totalGross - value;
        }

        System.out.println("Missing values :"+totalGross);
    }

    public static void main(String[] args) {
        
        int[] arr = {2,4,1,8,6,3,7};
       
        Lecture32 lec = new Lecture32();
        lec.Test1(arr);
        lec.Test2(arr);

    }
}
