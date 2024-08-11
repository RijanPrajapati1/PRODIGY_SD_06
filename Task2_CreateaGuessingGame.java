import java.util.Random;
import java.util.Scanner;

public class Task2_CreateaGuessingGame {
    public static void main(String[] args) {
        // Create an instance of Random to generate a random number
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfAttempts = 0;
        boolean guessedCorrectly = false;
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        // Loop until the user guesses the number
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;
            
            // Compare the guess to the generated number
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
