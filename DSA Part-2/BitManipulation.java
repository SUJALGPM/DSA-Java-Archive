/*
⚓New concept Bit Manipulation...
Bit manipulation in Java involves performing operations directly on the individual bits of data types, typically integers. 
This allows for efficient computation and can be used for a variety of tasks such as setting, clearing, toggling, and checking the value of specific bits.
*/

public class BitManipulation{
    public static void main(String[] args) {
        
        //Get Bit Operation...
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("Bit was zero.");
        }else{
            System.out.println("Bit was one.");
        }

        //Set Bit Operation...
        int number = 5; //0101
        int position = 3; 
        int bitMask = 1<<position; // 1000
        int result  = bitMask | number;
        System.out.println("Final Output after set bit :"+result);

        //Clear Bit Operation...  First do NOT operation to mask then do AND operation with actual nummber
        int number = 5; //0101
        int position = 2;
        int bitMask = ~(1<<position); //0001 --> 0100 --> 1011   
        int result = bitMask & number;
        System.out.println("Final output after Clear bit :"+result);

        //Update(Toggle) Bit operation...
        int number = 5; //0101
        int position = 3;
        int bitMask = 1<<position; //0010
        int result = bitMask ^ number;
        System.out.println("Final output after Update bit :"+ result);

    }
}