
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number;
        while(true){
            System.out.println("Give a number:");
            System.out.println("");
            number= Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            
            i++;
        }
        System.out.println("Number of numbers: " + i);

    }
}
