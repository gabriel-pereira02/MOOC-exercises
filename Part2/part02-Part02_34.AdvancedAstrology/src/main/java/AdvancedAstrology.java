
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        String ast = "";
        for(int i = 0; i < number; i++){
            ast = ast + "*";
        }
        
        System.out.println(ast);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spc = "";
        for(int i = 0; i < number; i++){
            spc = spc + " ";
        }
        
        System.out.print(spc);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++){
            if(size - 1 != 0){
                printSpaces(size - i);
            }
           
            printStars(i);
        }
        
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starNum = 1;
        
        for(int i = 1; i <= height; i++){
            
            if(height - 1 != 0){
                printSpaces(height - i);
            }
            printStars(starNum);
            starNum += 2;
        }
        
        int baseSpace = (starNum - 5)/2;
        
        for(int i = 1;i <= 2;i++){
            printSpaces(baseSpace);
            printStars(3);
        }
        
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        /*printSpaces(5);
        System.out.println(" ");
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");*/
        
        
        christmasTree(10);
    }
}
