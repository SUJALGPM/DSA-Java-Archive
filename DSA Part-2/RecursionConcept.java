public class RecursionConcept {

    //Print numbers in ranges.
    public static void printNumbers(int n){
        if(n==0){
            return;
        }

        System.out.println(n);

        //recursion...
        printNumbers(n-1);
    }

    //Print sum of first n natural numbers.
    public static void printSum(int n,int sum){
        if(n==0){
            System.out.println("Total sum of n natural numbers : "+sum);
            return;
        }

        sum += n;
        printSum(n-1, sum);
    }

    //Print factorial of given number.
    public static void printFact(int n,int fact){

        if(n==1){
            System.out.println("Factorial of give number is : "+fact);
            return;
        }

        fact = fact * n;

        printFact(n-1, fact);
    }

    //Print Fibo Series.
    public static void printFiboSeries(int firstValue, int secondValue,int n){ //1 1 4
        if(n==0){
            return;
        }
        
        System.out.println(firstValue); //1
        printFiboSeries(secondValue,firstValue+secondValue,n-1); //1 1+1 4
    }

    //Print x to power n. actually we get res with help of memory stack of recursion.
    public static int printPower(int x,int n){
        if(n==0){
            return 1; 
        }

        if(x==0){
            return 0;
        }

        int powerCalc = printPower(x, n-1);
        System.out.println("v :"+powerCalc);

        int result = x * powerCalc;

        return result;
    }

    public static void main(String[] args) {

        //Recursive function calls...
        printNumbers(5);
        printSum(5,0);
        printFact(3,1);
        printFiboSeries(0,1,5);
        System.out.println(printPower(2, 5));

    }
}
