
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int soma = 0;
        while(true){
            System.out.println("Give a number:");
            number= Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            soma += number;
        }
        System.out.println("Sum of the numbers: " + soma);
    }
}
