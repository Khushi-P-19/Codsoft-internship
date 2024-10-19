
import java.util.Random;
import java.util.Scanner;

public class random_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int randomNumber = random.nextInt(9) + 1; // Random number between 1 and 100
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 10.");

            while (!guessed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
