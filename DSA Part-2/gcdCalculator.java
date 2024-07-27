import java.util.*;

public class gcdCalculator{

    public static void main(String[] args) {

        int remainder = 0;

        //Create instance of input Class...
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number :");
        int a = input.nextInt();

        System.out.println("Enter 2nd number :");
        int b = input.nextInt();

        //TO FIND GCD WE USE Euclidean Algorithm:
        //step1 : if a > b then divide a by b and we get reminder is r;
        //step2 : then replace a with b and b with r;
        //step3 : repeat this process until r = 0; The GCD is the last non-zero remainder.

        int temp;
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }

        int r;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }

        System.out.println("FINAL CACALUCATE GCD : "+a);

    }
}
