
import java.util.Scanner;

//Question : Given a string, the task is to check whether a given string is palindrome or not.

public class Lecture34 {
    
    //Check word || number is palindrome or not...
    public void checkString(String word){
        char[] charArray = word.toCharArray();
        int startIndex = 0;
        int endIndex = charArray.length - 1;
        Boolean isPalindrome = true;

        while(startIndex < endIndex){
            if(charArray[startIndex] != charArray[endIndex]){
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }

        if(isPalindrome){
            System.out.println("Your input word || number is palindrome...");
        }else{
            System.out.println("Your input word || number is not palindrome...");
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter word || number to check it palindrome or not :");
        String word = input.nextLine();

        Lecture34 lec = new Lecture34();
        lec.checkString(word);
    }
}
