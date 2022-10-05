import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //String test = "d4&5e3Z8";     -> String for ease of testing
        Scanner keyboard = new Scanner(System.in);
        String test = keyboard.nextLine();
        
        //Split String into Array
        String[] arr = test.split("");

        // initialise variable x for counting index
        int x = 0;
        for (int j = 1; j <= arr.length; j+=2) {
            int multiplier = Integer.parseInt(arr[j]);
            for (int i = 1; i <= multiplier; i++) {
            System.out.print(arr[x]);
        }
        x += 2;
        }
    }
}
