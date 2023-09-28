/*Create a program that allows the user to play
the classic game of rock, paper, scissors
against the computer.*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = { "Rock", "Paper", "Scissors" };

        while (true) {
            System.out.println("Choose your move: ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");
            
            int userChoice = scanner.nextInt();
            
            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                continue;
            }
            
            int computerChoice = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors
            System.out.println("Computer chose: " + choices[computerChoice]);

            int result = (userChoice - 1) - computerChoice;
            
            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1 || result == -2) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        
        scanner.close();
    }
}
