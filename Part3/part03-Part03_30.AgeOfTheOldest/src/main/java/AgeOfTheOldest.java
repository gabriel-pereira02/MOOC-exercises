
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Oldest = 0;
        
        while(true){
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            
            String[] words = phrase.split(",");
            if(Integer.valueOf(words[1]) > Oldest){
                Oldest = Integer.valueOf(words[1]);
            }
            
        }
        
        System.out.println("Age of the oldest: " + Oldest);


    }
}
