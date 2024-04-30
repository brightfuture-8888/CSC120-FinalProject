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

    public void Yamanashi(int answerYNorth, int answerYSouth) {
        this.answerYNorth = answerYNorth;
        this.answerYSouth = answerYSouth; 

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
        }
    }

    public void Nara(int answerNaNorth, int answerNaSouth) {
        this.answerNaNorth = answerNaNorth;
        this.answerNaSouth = answerNaSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response.equals("north")) {

            Scanner input = new Scanner(System.in);
            this.answerNaNorth = input.nextInt();
            input.close();

            System.out.println("You're at Nara City");
            System.out.println("What is the mascot character of Nara? (Answer with the number)");

            if (answerNaNorth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }

        }

        if (response.equals("south")) {

            Scanner input = new Scanner(System.in);
            this.answerNaSouth = input.nextInt();
            input.close();

            System.out.println("You're at Asuka-mura");
            System.out.println("Is Todai-ji temple a national heritage site? Yes(1) or no(0)");

            if (answerNaSouth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
        }

    }

    public void Saitama(int answerSNorth, int amswerSSouth) {
        this.answerSNorth = answerSNorth;
        this.answerSSouth = amswerSSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response == "north") {

            Scanner input = new Scanner(System.in);
            this.answerSNorth = input.nextInt();
            input.close();

            System.out.println("You're at Saitama City.");
            System.out.println("What is the most prevalent foreign nationality among Saitama residents?");

            if (answerSNorth == 1) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }

        }

        if (response == "south") {

            Scanner input = new Scanner(System.in);
            this.answerSSouth = input.nextInt();
            input.close();

            System.out.println("You're at Higashimatsuyama!");
            System.out.println("You’re at Saitama Children’s zoo! What year did this zoo open?");

            if (answerNaSouth == 1980) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
        }
    }

    public void Kyoto(int answerKNorth, int answerKSouth) {
        this.answerKNorth = answerKNorth;
        this.answerKSouth = answerKSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response == "north") {

            Scanner input = new Scanner(System.in);
            this.answerKNorth = input.nextInt();
            input.close();

            System.out.println("You're at Northern Kyoto City");
            System.out.println("Kinkakuji Temple (aka The Temple of the Golden Pavilion)");
            System.out.println("What do they say the building is known for?");
            System.out.println("Its exterior completely covered in gold leaf" + " " + "Yes-- type 1" + " "
                    + "No-- type any number");

            if (answerKNorth == 1) {
                System.out.println(
                        "Yes! The beautifully created golden exterior of Kinkakuji represents wealth, prosperity, and the pursuit of enlightenment. You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }

            System.out.println(
                    "Next question: Being the longest existing building out of all the historical buildings in Kyoto"
                            + " " + "Yes-- type 1" + " " + "No-- type any number");

            if (answerKNorth == 1) {
                System.out.println(
                        "Uh Oh… Kinkakuji was unfortunately burned down by a Buddhist monk back in 1950. The building we see today is a reconstruction of the building from 1955. Nice try!"
                                + " " + "You lost a token.");
            } else {
                System.out.println("You are correct! You gained a token.");
            }

            System.out.println("Question 3:The temple does not have a single nail used in the entire structure" + " "
                    + "Yes-- type 1" + " " + "No-- type any number");

            if (answerKNorth == 1) {
                System.out.println(
                        "Uh Oh… You might be thinking of Kiyomizudera temple, which in fact was created without using a single nail in their temple structure"
                                + " " + "You lost a token.");
            } else {
                System.out.println("You are correct! You gained a token.");
            }

            System.out.println("Last question!: Being the oldest building built in Kyoto");

            if (answerKNorth == 1) {
                System.out.println(
                        "You might be thinking of Daigoji temple, which was built back in 951 as the oldest building in Kyoto. Kinkakuji was built in 1397! You lost a token.");
            } else {
                System.out.println("You are correct! You gained a token.");
            }

        }

        if (response.equals("south")) {

            Scanner input = new Scanner(System.in);
            this.answerKSouth = input.nextInt();
            input.close();

            System.out.println("You're at Uji City!");
            System.out.println("Is Uji the best known as the place where tea was first cultivated in Japan?" + " "
                    + "Yes-- type 1" + " " + "No-- type any number");

            if (answerKSouth == 1) {
                System.out.println(
                        "Uji is best known as the place where tea was first cultivated in Japan in the Muromachi era. You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
        }
    }

    public void Osaka(int answerONorth, int answerOSouth) {
        this.answerONorth = answerONorth;
        this.answerOSouth = answerOSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response.equals("north")) {

            Scanner input = new Scanner(System.in);
            this.answerONorth = input.nextInt();
            input.close();

            System.out.println("You're at Northern Osaka City!");
            System.out.println(
                    "World Expos are known as International Registered Exhibitions. At World Expos, countries build extraordinary pavilions to introduce their countries");
            System.out.println("Will World Expo 2025 be located in Osaka, Japan?" + " " + "Yes-- type 1" + " "
                    + "No-- type any number");

            if (answerONorth == 1) {
                System.out.println(
                        "Yes! Japan Association for the 2025 World Exposition has forecasted about that it will hold 282 million visitors during the term (154,000 visitors a day on average)");
            } else {
                System.out.println("... You lost a token...");
            }
        }

        if (response.equals("south")) {

            Scanner input = new Scanner(System.in);
            this.answerOSouth = input.nextInt();
            input.close();

            System.out.println("You're at Southern Osaka City!");
            System.out.println("Do we have Universal Studio in Japan?" + " "
                    + "Yes-- type 1" + " " + "No-- type any number");

            if (answerOSouth == 1) {
                System.out.println(
                        "Yes! It was build in 2021 as the first Universal Studio to open outside the United States. You gained a token.");
            } else {
                System.out.println("Oops! You lost a token.");
            }
        }
    }

    public void Niigata(int answerNNorth, int answerNSouth) {
        this.answerNNorth = answerNNorth;
        this.answerNSouth = answerNSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");

        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);

        direction.close();

        if (response.equals("north")) {

            Scanner input = new Scanner(System.in);
            this.answerNNorth = input.nextInt();
            input.close();

            System.out.println("You're at Niigata City! (North part of Japan)");
            System.out.println(
                    "Does Niigata face the Japanese sea?" + " " + "Yes-- type 1" + " "
                            + "No-- type any number");

            if (answerNNorth == 1) {
                System.out.println(
                        "Yes! You gained a token!");
            } else {
                System.out.println("........ You lost a token...");
            }
        }

        if (response.equals("south")) {

            Scanner input = new Scanner(System.in);
            this.answerNSouth = input.nextInt();
            input.close();

            System.out.println("You're at Southern Niigata City!");
            System.out.println("Is Niigata No.1 producing area for rice in Japan?" + " "
                    + "Yes-- type 1" + " " + "No-- type any number");

            if (answerNSouth == 1) {
                System.out.println(
                        "Yes! You gained a token.");
            } else {
                System.out.println("Oops! You lost a token.");
            }
        }
    }

    public static void main(String[] args) {
        Site mySite = new Site();
        mySite.Yamanashi(112, 3776);
        mySite.Nara(1, 1);
        mySite.Saitama(1, 1);
        mySite.Kyoto(1, 1);
        mySite.Niigata(1, 1);
        mySite.Osaka(1, 1);
    }
}
