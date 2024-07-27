import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lecture17 {

    //Handle to print array values...
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //Handle to sort array...
    public void myArray(){
        int arr[] = {12,33,10,7,80,4,90,77,6};
        ArrayList<Integer> values = new ArrayList<>();

        //Filter array even elements..
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                values.add(arr[i]);
            }
        }

        //Sort even elements in asc order...
        // Collections.sort(values);

        //Sort even elements in desc order...
        Collections.sort(values,Comparator.reverseOrder());

        //Convert Arraylist Integer back to int array values...
        int[] newValues = values.stream().mapToInt(i->i).toArray();

        printArray(newValues);
    }

    public static void main(String[] args) {
        System.out.println("hey start new concept");

        Lecture17 lec = new Lecture17();
        lec.myArray();
    }
}



