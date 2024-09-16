
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Oldest = 0;
        String nameOfTheOldest = "";
        while(true){
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            
            String[] words = phrase.split(",");
            if(Integer.valueOf(words[1]) > Oldest){
                Oldest = Integer.valueOf(words[1]);
                nameOfTheOldest = words[0];
            }
            
        }
        
        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}
