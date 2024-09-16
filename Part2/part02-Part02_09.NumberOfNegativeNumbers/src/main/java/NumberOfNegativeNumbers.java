
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number;
        while(true){
            System.out.println("Give a number:");
            number= Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            
            if(number > 0){
                continue;
            }
            i++;
        }
        System.out.println("Number of negative numbers: " + i);

    }

}

