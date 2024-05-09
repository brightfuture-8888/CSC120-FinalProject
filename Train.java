import java.util.Scanner;
import java.util.HashSet;

/**
 * Making Train Class with Scanner, Hashset, and returnTrain
 */
public class Train {

    private Scanner scanner;
    private HashSet<String> userLocations;
    private ReturnTrain returnTrain;

    /**
     * Create Train method
     * 
     * @param scanner
     */
    public Train(Scanner scanner) {
        this.scanner = scanner;
        userLocations = new HashSet<>();
        returnTrain = new ReturnTrain(scanner);
    }

    /**
     * Guide player after they get on a train
     */
    public void train() {

        System.out.println("You have now boarded the train! Choose a location to go to:");
        System.out.println("Yamanashi | Kyoto | Nara | Saitama | Niigata | Osaka ");

        /**
         * If the player already has visited this location, then let them know that they
         * should go to different location
         */
        returnTrain = new ReturnTrain(scanner);
        while (true) {
            String userInput = scanner.nextLine();
            if (userLocations.contains(userInput)) {
                System.out.println("You have already visited this location. Please pick another location");

                /**
                 * Go to Yamanashi
                 */
            } else if (userInput.toLowerCase().equals("yamanashi")) {
                System.out.println("Headed to Yamanashi...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("yamanashi");

                /**
                 * Go to Nara
                 */
            } else if (userInput.toLowerCase().equals("nara")) {
                System.out.println("Headed to Nara...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("nara");

                /**
                 * Go to Osaka 
                 */
            } else if (userInput.toLowerCase().equals("osaka")) {
                System.out.println("Headed to Osaka...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("osaka");

                /**
                 * Go to Kyoto 
                 */
            } else if (userInput.toLowerCase().equals("kyoto")) {
                System.out.println("Headed to Kyoto...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("kyoto");
                
                /**
                 * Go to Niigata 
                 */
            } else if (userInput.toLowerCase().equals("niigata")) {
                System.out.println("Headed to Niigata...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("niigata");
                
                /**
                 * Go to Saitama 
                 */
            } else if (userInput.toLowerCase().equals("saitama")) {
                System.out.println("Headed to Saitama...");
                scanner.nextLine();
                userLocations.add(userInput);
                goToSite("saitama");

                /**
                 * Tell the player that their input does not work for this game 
                 */
            } else {
                System.out.println("Sorry, that location does not exist. Where would you like to go?");
            }
        }
    }

    /**
     * Create goToSite method to explore every site 
     * @param siteArea
     */
    private void goToSite(String siteArea) {
        Site site = new Site();
        switch (siteArea) {
            case "yamanashi":
                site.Yamanashi();
                break;
            case "nara":
                site.Nara();
                break;
            case "osaka":
                site.Osaka();
                break;
            case "kyoto":
                site.Kyoto();
                break;
            case "niigata":
                site.Niigata();
                break;
            case "saitama":
                site.Saitama();
                break;
        }
        returnTrain.goBack(this);
    }
}