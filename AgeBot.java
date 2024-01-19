import java.util.Scanner;

/**
 * The AgeBot app class implements an application that
 * predicts your future based on age, wits, and motivation.
 */
public class AgeBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Age input and logic
        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        if (age < 18) {
            System.out.println("You are a child, grow up.");
        } else {
            System.out.println("You are an adult, go to work.");
        }

        // Brains input and logic
        System.out.print("Are you smart? (true/false) ");
        boolean brains = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline left-over
        if (!brains) {
            System.out.println("Go to work.");
        } else {
            System.out.println("Go to school.");
        }

        // Lazy input and logic
        System.out.print("How lazy are you from 1-10? ");
        int lazy = scanner.nextInt();
        if (lazy <= 4) {
            System.out.println("You are going to be a millionaire.");
        } else if (lazy <= 7) {
            System.out.println("You are going to be a bum.");
        } else {
            System.out.println("You are going to be homeless.");
        }

        scanner.close();
    }
}
