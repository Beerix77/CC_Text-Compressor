import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String test = "d4&5e3Z8";
        Scanner keyboard = new Scanner(System.in);
        String test = keyboard.nextLine();

        String[] arr = test.split("");

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

