import java.util.Scanner;

public class ExponentPower{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter power to you want :");
        double power = input.nextDouble();

        System.out.println("Enter base to you want :");
        int base = input.nextInt();

        double result = Math.pow(base, power);
        System.out.println(result);
    }
}   