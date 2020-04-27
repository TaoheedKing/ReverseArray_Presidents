import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Remember {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in the names of the last ten presidents in the order they were elected");
        for (int i = 0; i < 10; i++){
            String president = keyboard.nextLine();
            arr[i] = president;
        }
        System.out.println("Please enter 'history' to display the last 10 presidents in order!");
        String history = keyboard.nextLine();
        if (history.equalsIgnoreCase("history")) {
            System.out.print("Presidents from most recent: ");
            for (int j = 9; j >= 0; j--){
                System.out.print(arr[j]);
                System.out.print(" ");
            }
        } else {
            System.out.println("enter 'history' without the quotes to print on screen");
            history = keyboard.nextLine();
        }
    }
}
