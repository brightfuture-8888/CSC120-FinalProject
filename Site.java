import java.util.Scanner;

public class Site {

    String response;
    boolean checkAnswer;

    int answerNorth;
    int answerSouth;

    public void Yamanashi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Yamanashi!");

        System.out.println("Would you like to go North or South?");
    
        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"));{

            System.out.println("You're at Kouhu-shi");
            System.out.println("");
            System.out.println("How old is the oldest person in Yamanashi prefecture?");
            int answerNorth = scanner.nextInt();

            if (answerNorth == 112) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            scanner.close();
        }

        if (response == "south") {

            System.out.println("You are at Mt.Fuji");
            System.out.println("");
            System.out.println("Guess the height of Mt. Fuji in meters (no commas)");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 3776) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            scanner.close();
        }
    }

    // public void Nara {}

    // public void Osaka() {}

    // public void Niigata() {}

    // public void Kyoto() {}

    // public void Saitama() {}

}
