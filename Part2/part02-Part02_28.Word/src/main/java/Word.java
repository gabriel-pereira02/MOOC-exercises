
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word());
    }
    
    public static String word(){
        String word = "Hello World!";
        return word;
    }
}
