public class StringBuilderConcept {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Shadow");
        System.out.println("Before update word : "+sb);

        //Update string using StringBuilder..
        sb.setCharAt(0, 'P');
        System.out.println("After update word : "+sb);

        //Insert new char in string using StringBuilder..
        sb.insert(0,"S");
        System.out.println("After Insert new char : "+sb);

        //Delete string using String Builder..
        sb.delete(1, 4);
        System.out.println("After delete char from  word : "+sb);

        //Append new char in string...
        sb.append("D");
        System.out.println("After Append char in  word : "+sb);



        //....................................Reverse StringBuilder string METHOD-1.....................................

        System.out.println("Before reverse : "+sb);

        String str = sb.toString();
        char[] charArrary = str.toCharArray();
        int arrLength = charArrary.length;
        int startIdx = 0;
        int endIdx = charArrary.length - 1;
        char temp;
    
        while(startIdx < endIdx){
            temp = charArrary[startIdx];
            charArrary[startIdx] = charArrary[endIdx];
            charArrary[endIdx] = temp;
            startIdx++;
            endIdx--;
        }

        sb = new StringBuilder(new String(charArrary));
        System.out.println("After reverse : "+sb);



        //....................................Reverse StringBuilder string METHOD-2.....................................
        StringBuilder sbWord = new StringBuilder("Dingankar");
        System.out.println("Previous string : "+sbWord);

        for(int i=0;i<sbWord.length()/2;i++){
            int frontDoor = i;
            int backDoor = sbWord.length() - 1 - i; // 9-1-0   9-1-1=9-2 like that increment hoga...

            char frontChar = sbWord.charAt(frontDoor);
            char backChar = sbWord.charAt(backDoor);

            sbWord.setCharAt(frontDoor, backChar);
            sbWord.setCharAt(backDoor,frontChar);
        }

        System.out.println("String Reverse : "+sbWord);
    }
}
