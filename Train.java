import java.util.Scanner;
import java.util.HashSet;

public class Train {

    private Scanner scanner;
    private HashSet <String> userLocations;
    private ReturnTrain returnTrain;


    public Train(Scanner scanner){
        this.scanner = scanner;
        userLocations = new HashSet<>();
        returnTrain = new ReturnTrain(scanner);
    }

    public void train(){

        System.out.println("You have now boarded the train! Choose a location to go to:");
        System.out.println("Yamanashi | Kyoto | Nara | Saitama | Niigata | Osaka ");

        returnTrain = new ReturnTrain(scanner);
        while (true){
            String userInput = scanner.nextLine();
            if(userLocations.contains(userInput)){
                System.out.println("You have already visited this location. Please pick another location");

            } else if (userInput.toLowerCase().equals("yamanashi")){
                System.out.println("Headed to Yamanashi...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("yamanashi");

            } else if (userInput.toLowerCase().equals("nara")){
                System.out.println("Headed to Nara...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("nara");
                

            } else if (userInput.toLowerCase().equals("osaka")){
                System.out.println("Headed to Osaka...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("osaka");

            } else if (userInput.toLowerCase().equals("kyoto")){
                System.out.println("Headed to Kyoto...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("kyoto");

            } else if (userInput.toLowerCase().equals("niigata")){
                System.out.println("Headed to Niigata...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("niigata"); 
            
            } else if (userInput.toLowerCase().equals("saitama")){
                System.out.println("Headed to Saitama...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("saitama");

            } else {
                System.out.println("Sorry, that location does not exist. Where would you like to go?");
            }
        }
    }
    private void goToSite(String siteArea){
        Site site = new Site();
        switch (siteArea){
            case "yamanashi": site.Yamanashi();
            break;
            case "nara": site.Nara();
            break;
            case "osaka": site.Osaka();
            break;
            case "kyoto": site.Kyoto();
            break;
            case "niigata": site.Niigata();
            break;
            case "saitama": site.Saitama();
            break;
        }
        returnTrain.goBack(this);
    }
}