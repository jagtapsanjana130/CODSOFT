import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 5;

        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + attempts + " attempts.\n");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            
            // Prevent crash if user enters non-number
            if (!sc.hasNextInt()) {
                System.out.println("⚠ Please enter a valid number!");
                sc.next(); 
                continue;
            }

            guess = sc.nextInt();
            attempts--;

            if (guess > randomNumber) {
                System.out.println("Too High!");
            } 
            else if (guess < randomNumber) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("🎉 Correct! You guessed the number.");
                break;
            }

            if (attempts > 0) {
                System.out.println("Attempts left: " + attempts + "\n");
            } else {
                System.out.println("\n❌ Game Over!");
                System.out.println("The correct number was: " + randomNumber);
            }
        }

        sc.close();
    }
}