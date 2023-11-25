import java.util.*;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> gameLibrary = new ArrayList<>();
        System.out.println("Pick your favourite game : \n ");
        gameLibrary.add("pssGame");
        gameLibrary.add("Guess Game");


        do {
            System.out.println(gameLibrary);
            String userChoice = scanner.nextLine();


            switch (userChoice) {

                case "pssGame":
                    pssGame();
                    break;
                case "Guess Game":
                    guessGame();
                    break;
                default:
                    System.out.println("Wrong choice, try again ! ");
                    System.out.println("Pick your favourite game : \n ");
                    break;
            }
        } while (true);


    }
    public static void guessGame() {
        Random random = new Random();
        Scanner scanner1 = new Scanner(System.in);


        int numberToGuess = random.nextInt(100) + 1;

        int myScore = 0;

        while (true) {
            System.out.println("Enter your guess number");
            int myGuess = scanner1.nextInt();
            myScore++;
            if (myGuess == numberToGuess) {
                System.out.println("Bitch you won !");
                System.out.println("You had " + myScore + " tries ");
                break;
            } else if (myGuess < numberToGuess) {
                System.out.println("Bitch guess again, your number is lower then should be ");

            } else {
                System.out.println("Bitch guess again, your number is higher then should be ");
            }
        }

    }

    public static void pssGame() {
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            String [] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Enter your move");
                playerMove = scanner2.nextLine();
                if (playerMove.equals("r") ||playerMove.equals("p") || playerMove.equals("s"));
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        } 

    }


    
    }




