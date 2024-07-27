
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //1st number is 0th position in fibo series;
        int value1 = 0;

        //2nd number is 1th position in fibo series;
        int value2 = 1;

        System.out.println("ENTER NUMBER TILL YOU WANT FIBO SERIES :");
        int userInput = scan.nextInt();
        
        if (userInput <= 0) {
            System.out.println("Number of terms must be positive.");
        } else if (userInput == 1) {
            System.out.println("Fibonacci Series: " + value1);
        } else if (userInput == 2) {
            System.out.println("Fibonacci Series: " + value1 + " " + value2);
        } else {
            System.out.print("Fibonacci Series: " + value1 + " " + value2);
            int temp;
            for (int i = 2; i < userInput; i++) {
                temp = value1 + value2;
                System.out.print(" " + temp);
                value1 = value2;
                value2 = temp;
            }
            System.out.println(); // Newline for clean output
        }

    }
}
