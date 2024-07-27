
import java.util.Arrays;
import java.util.Scanner;

public class Lecture30 {

    public void reziseArray(int[] arr, int capacity){

        System.out.println("Before array size :"+arr.length);
        int[] newArray = new int[capacity];
        
        for(int i=0;i<arr.length;i++){
            newArray[i] = arr[i];
        }
        arr = newArray; 
        
        System.out.println("Before array size :"+arr.length);
        System.out.println("Actual array elements with rezise(scaleable) :"+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int arr[] = new int[4];
        arr[0] = 41;
        arr[1] = 22;
        arr[2] = 9;
        arr[3] = 10;

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter a new capacity :");
        int store = input.nextInt();

        Lecture30 lec = new Lecture30();
        lec.reziseArray(arr, store);
    }
}
