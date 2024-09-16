
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfYears = 0;
        String longestName = "";
        int i = 0;
        while(true){
            String phrase = scanner.nextLine();
            if(phrase.equals("")){
                break;
            }
            
            String[] words = phrase.split(",");
            int year = Integer.valueOf(words[1]);
            sumOfYears += year;
            
            if(words[0].length() > longestName.length()){
                longestName = words[0];
            }
            
            i++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) (sumOfYears)/i);


    }
}
