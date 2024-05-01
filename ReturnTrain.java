import java.util.Scanner;

public class ReturnTrain {
    private Scanner scanner;


    public ReturnTrain(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void goBack(Train train){
    System.out.println("What would you like to do next?");
    System.out.println("1. Go back to the train");
    System.out.println("2.Exit adventure");

    int response;
    while (true){
        try {
            response = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I didn't quite get that. Please enter a number.");
        }
    }

    switch(response){
        case 1: System.out.println("Going back to the train...");
        scanner.nextLine();
        train.train();
        break;

        case 2: System.out.println("Exiting the game...");
        break;
    }
}
}
