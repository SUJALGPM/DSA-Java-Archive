import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Rows and cols input handle...
        System.out.println("Enter No of rows :");
        int noRows = scan.nextInt();

        System.out.println("Enter No of cols :");
        int noCols = scan.nextInt();

        int[][] multiDimArray = new int[noRows][noCols];

        //Handle input data for 2d array...
        System.out.println("Enter Integer type data :");
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols;j++){
                multiDimArray[i][j] = scan.nextInt();
            }
            System.out.println(" ");
        }

        //Print 2D Array by iterate...
        System.out.println("Output Of 2d array : ");
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols;j++){
                System.out.print(multiDimArray[i][j] + " ");
            }
            System.out.println();
        }

        //Ask Element index...
        System.out.println("Enter a number to which you want index :");
        int searchIndex = scan.nextInt();

        //Search in array...
        System.out.println("Output Of Search Element index in array : ");
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols;j++){
                if(multiDimArray[i][j] == searchIndex){
                    System.out.print("rowIdx : "+ i + "colIdx :"+ j);
                }
            }
            System.out.println();
        }
    }
}
