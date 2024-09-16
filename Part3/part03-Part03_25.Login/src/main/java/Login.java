
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User();
        user1.username = "alex";
        user1.password = "sunshine";
        
        User user2 = new User();
        user2.username = "emma";
        user2.password = "haskell";
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        if((username.equals(user1.username) && password.equals(user1.password)) || (username.equals(user2.username) && password.equals(user2.password))){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }
    }
}
