import java.util.Scanner;

public class Site {
    // String name;
    // String question;
    String response;
    boolean checkAnswer;

    int answerYNorth;
    int answerYSouth;

    public void Yamanashi(int answerYNorth, int answerYSouth) {
        // this.name = name;
        // this.question = question;
        this.answerYNorth = answerYNorth;
        this.answerYSouth = answerYSouth;

        Scanner direction = new Scanner(System.in);
        System.out.println("North or South?");
    
        String response = direction.nextLine();
        System.out.println("You are going to" + " " + response);
        
        direction.close();

        if (response == "north") {

            Scanner input = new Scanner(System.in);
            this.answerYNorth = input.nextInt();
            input.close();

            System.out.println("You're at Kouhu-shi");
            System.out.println("How old is the oldest person in Yamanashi prefecture?");

            if (answerYNorth == 112) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
        }

        if (response == "south") {

            Scanner input = new Scanner(System.in);
            this.answerYSouth = input.nextInt();
            input.close(); 

            System.out.println("You're at Mt.Fuji");
            System.out.println("Guess the height of Mt. Fuji in meters (no commas)");

            if (answerYSouth == 3776) {
                System.out.println("Congrats!! You are right!! You gained a token");
            } else {
                System.out.println("You are incorrect! You lost a token.");
            }
        }
    }

    // public void Nara(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    // public void Osaka(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    // public void Niigata(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    // public void Kyoto(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    // public void Saitama(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    // public void tokyoStation(String name, String question, int answer) {
    // this.name = name;
    // this.question = question;
    // this.answer = answer;
    // }

    public static void main(String[] args) {
         Site mySite = new Site();
         mySite.Yamanashi(112,3776); 
    }
}
