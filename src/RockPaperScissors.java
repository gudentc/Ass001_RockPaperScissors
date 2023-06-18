import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       // Declare Variables
        String PlayerA = "";
        String PlayerB = "";
        String trash = "";
        String Menu = "\nR - Rock\tP - Paper\tS - Scissors: \n";
        boolean done = false;
        boolean PlayAgain = false;
        do {
            System.out.print(Menu);
            do {
                System.out.print("Player A - What is your move: ");
                if(in.hasNext("[RPSrps]")) {
                    PlayerA = in.next();
                    in.nextLine(); // clears the line from buffer
                    done = true; // we have a valid number
                } else {
                    // Not RPSrps
                    trash = in.nextLine();
                    System.out.println("You entered: " + trash);
                    System.out.println("You have to enter a valid move!");
                }
            } while (!done);
            done = false;
            do {
                System.out.print("Player B - Enter your move: ");
                if(in.hasNext("[RPSrps]")) {
                    PlayerB = in.next();
                    in.nextLine(); //clears the newline from the buffer
                    done = true; // we got a valid move
                } else {
                    // Not RSPrps
                    trash = in.nextLine();
                    System.out.println("You entered: " + trash);
                    System.out.println("You have to enter a valid move!");
                }
            } while (!done);
            // if we get this far we have two valid moves
            if (PlayerA.equalsIgnoreCase(PlayerB)) {
                System.out.println("\nIt's a draw!");
            } else if (PlayerA.equalsIgnoreCase("R")) {
                if (PlayerB.equalsIgnoreCase("S")) {
                    System.out.println("\nRock breaks Scissors - Player A wins");
                } else {
                    System.out.println("\nPaper wraps Rock - Player B wins");
                }
            } else if (PlayerA.equalsIgnoreCase("P")) {
                if (PlayerB.equalsIgnoreCase("S")) {
                    System.out.println("\nScissors cuts Paper - Player B wins");
                } else {
                    System.out.println("\nPaper wraps Rock - Player A wins");
                }
            } else if (PlayerA.equalsIgnoreCase("S")) {
                if (PlayerB.equalsIgnoreCase("P")) {
                    System.out.println("\nScissors cuts Paper - Player A wins");
                } else {
                    System.out.println("\nRock breaks Scissors - Player B wins");
                }
            }
            System.out.print("\nDo you want to play again? [Y/N] ");
            if(in.hasNext(" [Yy]")) {
                in.nextLine(); // clears the newline from the buffer
                PlayAgain = true;
            } else {
                // Not Yy
                trash = in.nextLine();
                System.out.println("Good Bye!");
                System.exit(0);
            }
        }while(PlayAgain);
    }
}