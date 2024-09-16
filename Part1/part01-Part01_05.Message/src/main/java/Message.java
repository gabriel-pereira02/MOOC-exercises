
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {

        System.out.println("Write a message:");
        // Write your program here
        
        /*
            Cria um objeto scan da classe Scanner
        */
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        System.out.println(message);
    }
}
