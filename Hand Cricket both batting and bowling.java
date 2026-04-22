import java.util.Scanner;
import java.util.Random;

public class HandCricket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== 🏏 FULL MATCH HAND CRICKET 🏏 ===");
        System.out.print("Do you want to BAT or BOWL first? (type 'bat' or 'bowl'): ");
        String choice = scanner.next().toLowerCase();

        int userScore = 0;
        int cpuScore = 0;

        if (choice.equals("bat")) {
            userScore = playInnings(scanner, random, "YOU ARE BATTING", true, -1);
            System.out.println("\n--- INNINGS OVER ---");
            System.out.println("Target for Computer: " + (userScore + 1));
            
            cpuScore = playInnings(scanner, random, "YOU ARE BOWLING", false, userScore);
        } else {
            cpuScore = playInnings(scanner, random, "YOU ARE BOWLING", false, -1);
            System.out.println("\n--- INNINGS OVER ---");
            System.out.println("Target for You: " + (cpuScore + 1));
            
            userScore = playInnings(scanner, random, "YOU ARE BATTING", true, cpuScore);
        }

        // Final Result Logic
        System.out.println("\n==============================");
        System.out.println("FINAL SCORE -> YOU: " + userScore + " | CPU: " + cpuScore);
        if (userScore > cpuScore) {
            System.out.println("🏆 CONGRATULATIONS! YOU WON!");
        } else if (cpuScore > userScore) {
            System.out.println("💻 COMPUTER WON! BETTER LUCK NEXT TIME.");
        } else {
            System.out.println("🤝 IT'S A TIE!");
        }
        System.out.println("==============================");

        scanner.close();
    }

    // Helper method to handle an innings
    public static int playInnings(Scanner sc, Random rnd, String phase, boolean isUserBatting, int target) {
        int score = 0;
        System.out.println("\n--- " + phase + " ---");

        while (true) {
            System.out.print("Enter move (1-10): ");
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            int userMove = sc.nextInt();
            if (userMove < 1 || userMove > 10) continue;

            int cpuMove = rnd.nextInt(10) + 1;
            System.out.println("Computer: " + cpuMove + " | You: " + userMove);

            if (userMove == cpuMove) {
                System.out.println("☝️ OUT!");
                break;
            } else {
                if (isUserBatting) score += userMove;
                else score += cpuMove;
                
                System.out.println("Current Score: " + score);
            }

            // Check if the chasing team passed the target
            if (target != -1 && score > target) {
                break;
            }
        }
        return score;
    }
}