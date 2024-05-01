import java.util.Scanner;
import java.util.HashSet;

public class Train {

    private Scanner scanner;
    private HashSet <String> userLocations;

    public Train(){
        scanner = new Scanner(System.in);
        userLocations = new HashSet<>();
    }

    public void train(){

        System.out.println("You have now boarded the train! Choose a location to go to:");
        System.out.println("Yamanashi | Kyoto | Nara | Saitama | Niigata | Osaka ");

        while (true){
            String userInput = scanner.nextLine();
            if(userLocations.contains(userInput)){
                System.out.println("You have already visited this location. Please pick another location");

            } else if (userInput.toLowerCase().equals("yamanashi")){
                System.out.println("Headed to Yamanashi...");
                scanner.nextLine();
                Site site = new Site();
                site.Yamanashi();
                userLocations.add(userInput);
                break;

            } else if (userInput.toLowerCase().equals("nara")){
                System.out.println("Headed to Nara...");
                scanner.nextLine();
                Site site = new Site();
                site.Nara();
                userLocations.add(userInput);
                break;

            } else if (userInput.toLowerCase().equals("osaka")){
                System.out.println("Headed to Osaka...");
                scanner.nextLine();
                Site site = new Site();
                site.Osaka();
                userLocations.add(userInput);
                break;

            } else if (userInput.toLowerCase().equals("kyoto")){
                System.out.println("Headed to Kyoto...");
                scanner.nextLine();
                Site site = new Site();
                site.Kyoto();
                userLocations.add(userInput);
                break;

            } else if (userInput.toLowerCase().equals("niigata")){
                System.out.println("Headed to Niigata...");
                scanner.nextLine();
                Site site = new Site();
                site.Niigata();
                userLocations.add(userInput);
                break;
            
            } else if (userInput.toLowerCase().equals("saitama")){
                System.out.println("Headed to Saitama...");
                scanner.nextLine();
                Site site = new Site();
                site.Saitama();
                userLocations.add(userInput);
                break;

            } else {
                System.out.println("Sorry, that location does not exist. Where would you like to go?");
            }
        }
    }
}
