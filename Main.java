import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //String test = "d4&5e3Z8";     -> random String for ease of testing
        
        // Keyboard input setup
        Scanner keyboard = new Scanner(System.in);
        String test = keyboard.nextLine();

        // Create an Array from inputed string
        String[] arr = test.split("");

        // initialise variables for counting index etc
        int x = 0;
        int y = 1;

        for (int j = 0; j <= arr.length - 1; j+=2) {
            int multiplier = Integer.parseInt(arr[y]);
            for (int i = 1; i <= multiplier; i++) {
            System.out.print(arr[x]);
        }
        x += 2;
        y += 2;
    }
}}
