
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        int[] lista1 = {1, 2, 3, 4};
        for (int i = 0; i < lista1.length; i++) {
            System.out.print(lista1[i] + " "); 
        }
        
        int[] lista2 = lista1;
        int helper = lista2[0];
        lista2[0] = lista2[1];
        lista2[1] = helper;
        System.out.println(" ");
        for (int i = 0; i < lista1.length; i++) {
            System.out.print(lista1[i] + " "); 
        }
    }
}
