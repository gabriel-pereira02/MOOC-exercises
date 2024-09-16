
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int number = 0;
        int sum = 0;
        while(true){
            number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            
            if(number > 0){
                i++;
                sum += number;
            }
        }
        
        double average = (double) sum/i;
        
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(average);
        }
    }
}
