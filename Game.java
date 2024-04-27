import java.util.Scanner;
// import com.google.common.graph.*;

// public class Game<Site> {
//     int currentScore;
//     String currentLocation;
//     ImmutableGraph<Site> map; 
    
// }
public class Game{
    public void start(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("You are standing in the middle of Tokyo station. There is a coin locker here.");
        play();
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);
        boolean coinLocker = false;
        boolean phoneMessage = false;

        while (true){
            System.out.println("What would you like to do?");
            String userInput = scanner.nextLine();

            if (userInput.equals("open coin locker")){
                System.out.println("Opening the coin locker reveals a phone that has a message.");
                coinLocker = true;
            } else if (coinLocker && userInput.equals("Read message")){
                System.out.println("-Message Opened-");
                System.out.println("Welcome to Japan! In this interavtive adventure game, you will explore different prefectures in the country, and complete missions along the way. There is a train waiting for you to board. Good luck!");
                phoneMessage = true;
            } else if (!coinLocker){
                System.out.println("You must open the coin locker to play the game");
            } else if (coinLocker && !phoneMessage){
                System.out.println("Sorry, I didn't get that. There is a message on the phone");
            }
            if (phoneMessage){
                break;
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
}

