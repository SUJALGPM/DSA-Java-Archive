import java.util.*;

public class Lecture18 {

    //Handle print array method...
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //Handle static array values and print...
    // public void inputArray(){
    //     int arr[] = new int[5];

    //     //assing static values to array...
    //     arr[0]=45;
    //     arr[1]=10;
    //     arr[2]=46;
    //     arr[3]=22;
    //     arr[4]=87;

    //     printArray(arr);
    // }


    //handle dyanmic input in array and print for that we use arraylist(DS)...
    public void inputArray(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        
        //Handle to store only integer values...
        while(scan.hasNextInt()){
            System.out.println("Enter Integer values && To stop type done in input...");
            int values = scan.nextInt();
            dynamicArray.add(values);
        }

        // Convert ArrayList to int array...
        int[] newArray = dynamicArray.stream() // Step 1: Create a stream from the ArrayList
                    .mapToInt(i -> i) // Step 2: Convert each Integer to an int
                    .toArray(); // Step 3: Collect the int values into an int array

        //Finally print store array values...
        printArray(newArray);
    }

    
    //Handle class main method...
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        Lecture18 lec = new Lecture18();
        lec.inputArray();

    }
}