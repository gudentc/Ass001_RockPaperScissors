import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       // Declare Variables
        String player1 = "";
        String player2 = "";
        String trash = "";
        String Menu = "\nR - Rock\tP - Paper\tS - Scissors: \n";
        boolean done = false;
        boolean playAgain = false;
        do {
            System.out.print(Menu);
            do {
                System.out.print("Player 1 - What is your move? ");
                if(in.hasNext("[RPSrps]")) {
                    player1 = in.next();
                    in.nextLine(); // clears the line from buffer
                    done = true; // we have a valid number
                } else {
                    // Not RPSrps
                    trash = in.nextLine();
                    System.out.println("You entered: " + trash);
                    System.out.println("You entered a valid move!");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Player 2 - What is your move? ");
                if(in.hasNext("[RPSrps]")) {
                    player2 = in.next();
                    in.nextLine(); //clears line from the buffer
                    done = true; // we got a valid move
                } else {
                    // Not RSPrps
                    trash = in.nextLine();
                    System.out.println("You entered: " + trash);
                    System.out.println("You entered a valid move!");
                }
            } while (!done);
            // if we get this far we have two valid moves
            if (player1.equalsIgnoreCase(player2)) {
                System.out.println("\nIt's a draw!");
            } else if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("S")) {
                    System.out.println("\nRock smashes Scissors - Player 1 wins");
                } else {
                    System.out.println("\nPaper wraps Rock - Player 2 wins");
                }
            } else if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("S")) {
                    System.out.println("\nScissors cuts Paper - Player 2 wins");
                } else {
                    System.out.println("\nPaper wraps Rock - Player 1 wins");
                }
            } else if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("P")) {
                    System.out.println("\nScissors cuts Paper - Player 1 wins");
                } else {
                    System.out.println("\nRock smashes Scissors - Player 2 wins");
                }
            }
            System.out.print("\nDo you want a rematch? [Y/N] ");
            if(in.hasNext("[Yy]")) {
                in.nextLine(); // clears line from the buffer
                playAgain = true;
            } else {
                // Not Yy
                trash = in.nextLine();
                System.out.println("See you Later!");
                System.exit(0);
            }
        }while(playAgain);
    }
}