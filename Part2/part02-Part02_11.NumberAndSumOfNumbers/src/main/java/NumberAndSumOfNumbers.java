
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int number;
        
        while(true){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            sum += number;
            i++;
        }
        
        System.out.println("Number of numbers: " + i);
        System.out.println("Sum of the numbers: " + sum);

    }
}
