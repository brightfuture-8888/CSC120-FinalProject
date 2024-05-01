import java.util.Scanner;
// import com.google.common.graph.*;

// public class Game<Site> {
//     int currentScore;
//     String currentLocation;
//     ImmutableGraph<Site> map; 
    
// }
public class Game{
    private Scanner scanner;
    
    public void start(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("You are standing in the middle of Tokyo station. There is a coin locker here.");
        play();
    }
    public void play(){
        scanner = new Scanner(System.in);
        boolean coinLocker = false;
        boolean phoneMessage = false;
        boolean closeMessage = false;
        boolean boardTrain = false;

        while (true){
            System.out.println("What would you like to do?");
            String userInput = scanner.nextLine();

            if (userInput.toLowerCase().equals("open coin locker")){
                System.out.println("Opening the coin locker reveals a phone that has a message.");
                coinLocker = true;
            } else if (coinLocker && userInput.toLowerCase().equals("read message")){
                System.out.println("-Message Opened-");
                System.out.println("");
                System.out.println("Welcome to Japan! In this interavtive adventure game, you will explore different prefectures in the country, and complete missions along the way. There is a train waiting for you to board. Good luck!");
                phoneMessage = true;
            } else if (!coinLocker){
                System.out.println("Sorry, I didn't quite get that. You must open the coin locker to play the game");
            } else if (coinLocker && !phoneMessage){
                System.out.println("Sorry, I didn't get that. There is a message on the phone");
            } else if (coinLocker && phoneMessage && userInput.toLowerCase().equals("close message")){
                System.out.println("-Message Closed-");
                closeMessage = true;
            } else if (coinLocker && phoneMessage && !closeMessage){
                System.out.println("The message is still opened, you have to close it first!");
            } else if (coinLocker && phoneMessage && closeMessage && userInput.toLowerCase().equals("board train")){
                System.out.println("Boarding Train...");
                scanner.nextLine();
                System.out.println("-Train Boarded-");
                boardTrain = true;
            } else if (coinLocker && phoneMessage && closeMessage && !boardTrain){
                System.out.println("Directions are not clear. Board the train to resume journey.");
            }
            if (boardTrain){
                break;
            }
        }
        Train train = new Train(scanner);
        train.train();
        // scanner.close();

    }
    // public void end() {
    //     scanner.close();
    // }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.scanner.close();
    }
    
}

