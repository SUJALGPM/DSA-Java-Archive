//Question : Given an array of integers, write a function to move all 0's to end of it while maintining the relative order of the non-zero elements.abstract 


import java.util.Arrays;


public class Lecture28 {

    public void moveZeros(int[] arr, int n){

    //METHOD-1 TO MOVE ZEROS...
    //    int[] result = new int[arr.length];
    //    int resultIndex = 0;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != 0){
    //             result[resultIndex]=arr[i];
    //             resultIndex++;
    //         }
    //     }
    //     System.out.println(Arrays.toString(result));

    int temp;
    int j = 0;

    for(int i=0;i<n;i++){
        if(arr[i] != 0 && arr[j] == 0){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        if(arr[j] != 0){
            j++;
        }
    }

    System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        
        //Initilize array...
        int[] myArray = {0,1,0,4,12};

        int arrLength = myArray.length;

        //Instance of class...
        Lecture28 lec = new Lecture28();
        lec.moveZeros(myArray,arrLength);
       
    }
}
