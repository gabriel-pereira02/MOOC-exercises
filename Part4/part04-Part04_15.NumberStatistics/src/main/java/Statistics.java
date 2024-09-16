import java.util.Scanner;
public class Statistics {
    private int count;
    private int sum;
    
    
    
    public Statistics(){
        count = 0;
        sum = 0;
    }
    
    public void addNumber(int number){
        count++;
        sum += number;
    }
    
    public int getCount(){
        return count;
    }
    /*
    public void sumOfUserInputs(){
        sum = 0;
        System.out.println("Enter numbers: ");
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == -1){
                break;
            }
            
            sum += number;
        }
        
        System.out.println("Sum: " + sum());
    }
    */
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(count != 0){
            return (double) sum/count;
        }
        
        return 0;
    }
    
}
