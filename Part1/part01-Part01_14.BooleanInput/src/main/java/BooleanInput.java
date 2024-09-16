
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        /*
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);
        */
        String str = "samurai";
        String str2 = "ui";
        
        int lengthStr2 = str2.length();
        
        System.out.println(str.endsWith(str2));
        

    }
}
