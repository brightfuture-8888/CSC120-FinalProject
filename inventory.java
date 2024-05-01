import java.util.ArrayList;
import java.util.Arrays;

class inventory {

  ArrayList storeToken; // make an arraylist that stores token

  /***
   * This method asks you to put numbers of how many rounds you want to play.
   * It takes the user to put conversations and makes it to a basic chatbot.
   * It will give the user mirrorable words. 
   * 
   * @param args 
   */
  public static void main(String[] args) {
        int tokenNumber; 

        // System.out.println("How many rounds?"); 
        // int roundnumber; // user input here - will get overwritten
        // roundnumber = sc.nextInt(); // store number from user input 
        // sc.nextLine(); // clear out the new line 

    // System.out.println("Hi there!  What's on your mind?");

    ArrayList<String> storeToken = new ArrayList<>();

    for (int i = 0; i < tokenNumber; i++) { // create a loop that repeats for that amount of times
      userinput = sc.nextLine(); 
      storeTranscript.add(userinput);

      String[] words = userinput.split(" ");
      // System.out.println(Arrays.toString(words));
      boolean canned = true;

      for (int j = 0; j < words.length; j++) {

        String word = words[j];

        if (word.equals("I")) {
          words[j] = "you";
          canned = false;
        } else if (word.equals("you")) {
          words[j] = "I";
          canned = false;
        } else if (word.equals("me")) {
          words[j] = "you";
          canned = false;
        } else if (word.equals("am")) {
          words[j] = "are";
          canned = false;
        } else if (word.equals("my")) {
          words[j] = "your";
          canned = false;
        } else if (word.equals("your")) {
          words[j] = "my";
          canned = false;
        }
      }

      if (canned == true) {

        System.out.println(normalResponse[count]);
        storeTranscript.add(normalResponse[count]);

        count += 1;
        if (normalResponse.length == (count)) {
          count = 0;
        }

      } else {
        String cResponse = "";
        for (int n = 0; n < words.length; n++) {

          cResponse += words[n] + " ";
        }

        System.out.println(cResponse);
        storeTranscript.add(cResponse);
      }
    }
    sc.close();

    for (int i = 0; i < storeTranscript.size(); i++) {
      System.out.println("Print transcript--" + storeTranscript.get(i)); // print out transcript
    }

  }
}




