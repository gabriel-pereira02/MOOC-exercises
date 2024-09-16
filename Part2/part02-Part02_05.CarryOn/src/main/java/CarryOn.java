
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        while(true){
            System.out.println("Shall we carry on?");
            message = scanner.nextLine();
            if(message.equals("no")){
                break;
            }
        }

    }
}
