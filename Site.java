import java.util.Scanner;

public class Site {

    String response;
    boolean checkAnswer;

    int answerNorth;
    int answerSouth;
    int tokens = 0;

    public void Yamanashi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Yamanashi");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north")) {

            System.out.println("You're at Kouhu-shi");
            System.out.println("");
            System.out.println("How old is the oldest person in Yamanashi prefecture?");
            int answerNorth = scanner.nextInt();

            if (answerNorth == 112) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");

                scanner.nextLine();
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            // scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Mt.Fuji");
            System.out.println("");
            System.out.println("Guess the height of Mt. Fuji in meters (no commas)");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 3776) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");

            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }
    }

    public void Nara() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Nara!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"))
            ;
        {

            System.out.println("You're at Nara City");
            System.out.println("");
            System.out.println(
                    "What is the mascot character of Nara? Answer in numbers! Option 1- Sentokun, Option 2- Funashii");
            // Print out the options;
            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");

            } else {
                System.out.println("You are incorrect!");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Asuka-Mura");
            System.out.println("");
            System.out.println("Is Todai-ji temple a national heritage site? Yes(1) or no(0)");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

    }

    public void Osaka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Osaka!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"))
            ;
        {

            System.out.println("You're at Northern Osaka City");
            System.out.println("");
            System.out.println(
                    "World Expos are known as International Registered Exhibitions. At World Expos, countries build extraordinary pavilions to introduce their countries");
            System.out.println("Will World Expo 2025 be located in Osaka, Japan?");
            System.out.println("Yes-- type 1");
            System.out.println("No-- type any number");

            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println(
                        "Yes! Japan Association for the 2025 World Exposition has forecasted about that it will hold 282 million visitors during the term (154,000 visitors a day on average)");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Southern Osaka City!");
            System.out.println("");
            System.out.println("Do we have a Universal Studios in Japan? 1:Yes 2:No");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

    }

    public void Niigata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Niigata!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"))
            ;
        {

            System.out.println("You're at North Niigata City");
            System.out.println("");
            System.out.println("Does Niigata face the Japanese sea? Yes or no Yes (1), No (2)");

            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Yes! That is correct! You have gained a token)");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Southern Niigata City!");
            System.out.println("");
            System.out.println("Do we have a Universal Studios in Japan? 1:Yes 2:No");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
                tokens = tokens + 1;
                System.out.println("you have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("you have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

    }

    public void Kyoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Kyoto!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"))
            ;
        {

            System.out.println(
                    "You have arrived at the Kinkakuji Temple, one of the most popular sightseeing attractions in Kyoto. You hear the tour guide talking,");
            System.out.println("");
            System.out.println("What do they say the building is known for? (answer the number)");
            System.out.println("1. Its exterior completely covered in gold leaf");
            System.out.println("2. Being the longest existing building out of all the historical buildings in Kyoto");
            System.out.println("3. The temple does not have a single nail used in the entire structure");
            System.out.println("4. Being the oldest building built in Kyoto");

            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Yes! The beautifully created golden exterior of Kinkakuji represents wealth, prosperity, and the pursuit of enlightenment.");
                System.out.println("You gained a token");
                tokens = tokens + 1;
                System.out.println("You have" + tokens + "token(s)");
            } else {
                // add the other option descriptions
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Southern Osaka City!");
            System.out.println("");
            System.out.println("Do we have a Universal Studios in Japan? 1:Yes 2:No");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1) {
                System.out.println("Congrats!! You are right!!");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect!");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
            // scanner.close();
        }

    }

    public void Saitama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have arrived at Saitama!");

        System.out.println("Would you like to go North or South?");

        String response = scanner.nextLine();
        System.out.println("You are going " + response);

        if (response.toLowerCase().equals("north"))
            ;
        {

            System.out.println("You have arrived at North Saitama City");
            System.out.println("");
            System.out.println("What is the most prevalent foreign nationality among Saitama residents?");
            System.out.println("1. China");
            System.out.println("2. Korea");
            System.out.println("3. US");
            System.out.println("4. Australia");

            int answerNorth = scanner.nextInt();
            if (answerNorth == 1) {
                System.out.println("Yes! That's right!");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                // add the other option descriptions
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
        }

        if (response.toLowerCase().equals("south")) {

            System.out.println("You are at Saitama Children's Zoo!");
            System.out.println("What year did this zoo open?");

            int answerSouth = scanner.nextInt();
            if (answerSouth == 1980) {
                System.out.println("Congrats!! You are right!!");
                tokens = tokens + 1;
                System.out.println("You now have" + tokens + "token(s)");
            } else {
                System.out.println("You are incorrect! You lost a token.");
                tokens = tokens - 1;
                System.out.println("You now have" + tokens + "token(s)");
            }
            System.out.println("");
        }
    }

}
