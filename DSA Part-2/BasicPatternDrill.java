public class BasicPatternDrill {

    //Solid Rectangle pattern...
    public void SolidRectanglePattern(){
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Hollow Rectangle Pattern...
    public void HollowRectanglePattern(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i == 4 || j == 1 || j == 5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Half Pyramid Pattern...
    public void HalfPyramidPattern(){
        int nrow = 4;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //SUJAL S LETTER Pattern...
    public void LetterPattern(){
        int nrow = 5;
        int ncol = 5;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=ncol;j++){
                if(i == 1 || i == nrow || ( i == (nrow+1)/2) || (i < (nrow + 1)/2 && j==1) || (i > (nrow + 1)/2 && j==ncol)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    //INVERTED HALF PYRAMID...
    public void InvertedHalfPyramid() {
        int nrow = 4;
        int count = 0;

        for(int i=nrow;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //INVERTED & ROTATED HALF PYRAMID...
    public void InvertedRotatedHalfPyramid() {
        int nrow = 4;

        for (int i = 1; i <= nrow; i++) {
            //inner loop -> print space
            for(int j = 1;j<=nrow-i;j++){
                System.out.print(" ");
            }

            //inner loop -> print start
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //HALF PYRAMID WITH NUMBERS...
    public void NumbersHalfPyramid(){
        int nrow = 5;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    //INVERTED HALF PYRAMID WITH NUMBERS...
    public void InvertedNumberHalfPyramid() {
        int nrow = 5;

        for(int i=nrow;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            System.out.println("");
        }
    }

    //FLOYD'S TRIANGLE PYRAMID...
    public void FloydTrianglePyramid(){
        int nrow = 5;
        int count = 1;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }

            System.out.println("");
        }
    }

    //ZEROS-ONEth TRIANGLE PYRAMID....
    public void ZerosOnePyramid(){
        int nrow = 5;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                System.out.print("1 ");
               }else{
                System.out.print("0 ");
               }
            }

            System.out.println("");
        }
    }

    //LETTER T PRINT PATTERN...@Test
    public void LetterPattern2() {
        int nrow = 5;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=nrow;j++){
                if(i==1 || j==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    //LETTER D PRINT PATTERN...
    public void LetterPattern3(){
        int nrow = 4;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=nrow;j++){
                
                if(j==1 || i+j == 6 || i+j == 3 || i+j == 7 || i+j == 4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    //BUTTERFLY PATTERN...
    public void ButterflyPattern(){
        int nrow = 4;
        int space;

        //Butterfly upper part...
        for(int i=1;i<=nrow;i++){

            //star print...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space print...
            space = 2 * (nrow - i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //star print...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }

        //Butterfly lower part...
        for(int i=nrow;i>=1;i--){

            //star print...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space print...
            space = 2 * (nrow - i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //star print...
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");

        }
    }

    //SOLID RHOMBUS PATTER...
    public void SolidRhombusPattern() {
        int nrow = 5;

        for(int i=1;i<=nrow;i++){

            //space print...
            for(int j=1;j<=nrow-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=nrow;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    //SOLID HOLLOW RHOMBUS PATTER...
    public void SolidHollowRhombusPattern() {
        int nrow = 5;

        for(int i=1;i<=nrow;i++){

            //space print...
            for(int j=1;j<=nrow-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=nrow;j++){
                if(j==1 || j==nrow){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    //SAME NUMBER'S PRINT PYRAMID...
    public void NumberSamePattern(){
        int nrow = 5;

        for(int i=1;i<=nrow;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }

            System.out.println(""); 
        }
    }


    public static void main(String[] args) {
        BasicPatternDrill base = new BasicPatternDrill();

        //Call 1st pattern...
        System.out.println("SOLID RECTANGLE PATTERN...");
        base.SolidRectanglePattern();
        
        //Call 2nd pattern...
        System.out.println("HOLLOW RECTANGLE PATTERN...");
        base.HollowRectanglePattern();

        //Call 3rd pattern...
        System.out.println("HALF PYRAMID PATTERN...");
        base.HalfPyramidPattern();

        //Call 4th pattern...
        System.out.println("S LETTER PATTERN...");
        base.LetterPattern();

        //Call 5th pattern...
        System.out.println("INVERTED HALF PATTERN...");
        base.InvertedHalfPyramid();

        //Call 6th pattern...
        System.out.println("INVERTED & ROTATED HALF PATTERN...");
        base.InvertedRotatedHalfPyramid();

        //Call 7th pattern...
        System.out.println("NUMBERS PATTERN...");
        base.NumbersHalfPyramid();

        //Call 8th pattern...
        System.out.println("INVERTED HALF PYRAMID WITH NUMBERS...");
        base.InvertedNumberHalfPyramid();

        //Call 9th pattern...
        System.out.println("FLOYD'S TRIANGLE PYRAMID...");
        base.FloydTrianglePyramid();

        //Call 10th pattern...
        System.out.println("ZEROS-ONEth TRIANGLE PYRAMID....");
        base.ZerosOnePyramid();

        //Call 11th pattern...
        System.out.println("T LETTER PATTERN...");
        base.LetterPattern2();

        //Call 12th pattern...
        System.out.println("D LETTER PATTERN...");
        base.LetterPattern3();

        //Call 13th pattern...
        System.out.println("BUTTERFLY PATTERN...");
        base.ButterflyPattern();

        //Call 14th pattern...
        System.out.println("SOLID RHOMBUS PATTER...");
        base.SolidRhombusPattern();

         //Call 15th pattern...
         System.out.println("SOLID HOLLOW RHOMBUS PATTER...");
         base.SolidHollowRhombusPattern();

         //Call 16th pattern...
         System.out.println("SAME NUMBER'S PRINT PYRAMID...");
         base.NumberSamePattern();
    }
}
