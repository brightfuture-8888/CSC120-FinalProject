import java.util.Scanner;

public class Site {

    String response;
    boolean checkAnswer;

    int answerYNorth; // Yamanashi North
    int answerYSouth; // Yamanash South

    int answerNaNorth; // Nara North
    int answerNaSouth; // Nara South

    int answerSNorth; // Saitama North
    int answerSSouth; // Saitama South

    int answerKNorth; // Kyoto North
    int answerKSouth; // Kyto South

    int answerONorth; // Osaka North
    int answerOSouth; // Osaka South

    int answerNNorth;
    int answerNSouth;

    public void Yamanashi() {

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response.equals("north")) {
            Scanner input = new Scanner(System.in);
            this.answerYNorth = input.nextInt();
            input.close();

            System.out.println("You're at Kouhu-shi");
            System.out.println("");
            System.out.println("How old is the oldest person in Yamanashi prefecture?");
            int answerNorth = input.nextInt();

            if (answerNorth == 112) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            input.close();
        }

        if (response.equals("south")) {

            Scanner input = new Scanner(System.in);
            this.answerYSouth = input.nextInt();
            input.close();

            System.out.println("You are at Mt.Fuji");
            System.out.println("");
            System.out.println("Guess the height of Mt. Fuji in meters (no commas)");

            int answerSouth = input.nextInt();
            if (answerSouth == 3776) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            input.close();
        }
    }

    public void Nara() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Nara!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"));{

            System.out.println("You're at Nara City");
            System.out.println("");
            System.out.println("What is the mascot character of Nara? (Answer with the number)");
            // Print out the options;
            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Asuka-Mura");
            System.out.println("");
            System.out.println("Is Todai-ji temple a national heritage site? Yes(1) or no(0)");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            scanner.close();
        }

    }

    public void Osaka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Osaka!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"));{

            System.out.println("You're at Northern Osaka City");
            System.out.println("");
            System.out.println("World Expos are known as International Registered Exhibitions. At World Expos, countries build extraordinary pavilions to introduce their countries");
            // Print out the options;
            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Southern Osaka City!");
            System.out.println("");
            System.out.println("World Expos are known as International Registered Exhibitions. At World Expos, countries build extraordinary pavilions to introduce their countries");
            System.out.println("Will World Expo 2025 be located in Osaka, Japan?");
            System.out.println("Yes-- type 1");
            System.out.println("No-- type any number");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
            System.out.println("");
            scanner.close();
        }

    }

//    public void Niigata() {}

    // public void Kyoto() {}

    // public void Saitama() {}

}
