
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        Statistics statistic = new Statistics();
        statistic.getCount();
        int i = 0;
        while(i < 20){
            statistic.addNumber(1);
            i++;
        }
        
        System.out.println(statistic.getCount());
        System.out.println("Sum: " + statistic.sum());
        System.out.println("Average: " + statistic.average());
        */
        
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        int number = 0;
        System.out.println("Enter numbers:");
        while(true){
            number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            }
            sum.addNumber(number);
            
            if(number%2 == 0){
                even.addNumber(number);
            } else{
                odd.addNumber(number);
            }
        }
        
        
        
        
    }
}
