//7. Write a program that will breakdown the amount and count notes for any given amount.
//        Here is the notes in the given array:
//        notes=[1000,500,200,100,50,20,10,5,2,1]
import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        int[] notes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Output:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                System.out.println(notes[i] + " " + count);
                amount %= notes[i];
            }
        }

        scanner.close();
    }
}
