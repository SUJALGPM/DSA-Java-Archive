import java.util.Arrays;

public class SortingTypes {
    public static void main(String[] args) {
        System.out.println("we start to learn bubble || selection || insertion sort in java.");

        
        /******************************** Bubble sort Operation *********************************/
        //How Bubble sort Works:
        //Step1 : Starting from the beginning of the list, compare each pair of adjacent elements.
        //Step2 : Swap them if they are in the wrong order.
        //Step3 : Continue this process for the whole list. After the first pass, the largest element is at the end of the list.
        //Step4 : Repeat the process for the rest of the list, excluding the last sorted elements.

        int[] arr = {18,5,79,46,2,11,90,70};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort opeartion result : "+Arrays.toString(arr));
        System.out.println("Time Complexity of Bubble sort : O(n^2)");



        /******************************** Selection sort Operation *********************************/
        //How Selection sort Works:
        //Step1 : Start with the first element of the list.
        //Step2 : Find the smallest element in the unsorted portion of the list.
        //Step3 : Swap this smallest element with the first unsorted element.
        //Step4 : Move the boundary of the sorted region one element to the right.
        //Step5 : Repeat the process for the rest of the list.

        int newArr[] = {7,8,1,3,2};

        for(int i=0;i<newArr.length-1;i++){
            int smallestIdx = i; 
    
            for(int j=i+1;j<newArr.length;j++){
               if(newArr[smallestIdx] > newArr[j]){
                smallestIdx = j;
               }
            }

            int temp = newArr[smallestIdx];
            newArr[smallestIdx] = newArr[i];
            newArr[i] = temp;
        }
        System.out.println("Selection sort operation result : "+Arrays.toString(newArr));
        System.out.println("Time Complexity of Bubble sort : O(n^2)");



        /******************************** Insertion sort Operation *********************************/
        //How Insertion sort Works:
        //Step1 : Start with the second element (assuming the first element is trivially sorted).
        //Step2 : Compare the current element with the elements in the sorted part of the array.
        //Step3 : Shift elements in the sorted part that are greater than the current element to one position to the right.
        //Step4 : Insert the current element into its correct position in the sorted part of the array.
        //Step5 : Repeat the process for each element in the array.

        int newArr2[] = {70,20,10,40,90,30,50};

        //Insertion Sort...
        for(int i=1;i<newArr2.length;i++){

            //current will be increment.
            int current = newArr2[i];
            
            //J always point to sorted part element and i also assumed my first element in array is sorted.
            int j = i - 1;

            //J is not be able to non-negative number.
            while(j >= 0 && newArr2[j] > current){
                newArr2[j+1] = newArr2[j];
                j--;
            }

            //Place value to proper pos.
            newArr2[j+1] = current;

            System.out.println("Insertion sort operation result :"+Arrays.toString(newArr2));

        }


    }
}
