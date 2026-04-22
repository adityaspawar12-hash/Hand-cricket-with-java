import java.util.Scanner;
import java.util.Random;

public class HandCricket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int userScore = 0;
        boolean isOut = false;

        System.out.println("===  WELCOME TO JAVA HAND CRICKET  ===");
        System.out.println("Rules: Enter a number from 1-10. If it matches the Computer, you are OUT!");
       

        while (!isOut) {
            System.out.print("Enter your run (1-10): ");
            
            // Checking if input is a number to prevent crashes
            if (!scanner.hasNextInt()) {
                System.out.println(" Invalid input! Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            int userMove = scanner.nextInt();

            // Validate Input
            if (userMove < 1 || userMove > 10) {
                System.out.println(" Invalid move! Play fair. Choose 1-10.");
                continue;
            }

            // Logic: nextInt(10) gives 0-9, so +1 gives 1-10
            int cpuMove = random.nextInt(10) + 1; 
            System.out.println("Computer showed: " + cpuMove);

            if (userMove == cpuMove) {
                System.out.println(" OUT! The numbers matched.");
                isOut = true;
            } else {
                userScore += userMove;
                System.out.println(" Nice shot! Current Score: " + userScore);
            }
            System.out.println("-------------------------");
        }

        System.out.println("G A M E   O V E R !");
        System.out.println("Your Final Score: " + userScore);
        
        // Fixed the random logic and syntax here
        int cpuSuggestion = random.nextInt(10) + 1;
        System.out.println("To beat you, the Computer should have shown: " + cpuSuggestion);
        
        scanner.close();
    }
}