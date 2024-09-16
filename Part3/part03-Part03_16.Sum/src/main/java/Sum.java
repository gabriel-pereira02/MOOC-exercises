
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int soma = 0;
        for (int i = 0; i < numbers.size(); i++) {
            soma += numbers.get(i);
        }
        
        return soma;
    }

}
