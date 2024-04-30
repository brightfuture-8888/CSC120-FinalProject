// import java.util.Scanner;
// import java.util.HashSet;

// public class Train {

//     private Scanner scanner;
//     private HashSet <String> userLocations;

//     public void train(){

//         System.out.println("You have now boarded the train! Choose a location to go to:");
//         while (true){
//             String userInput = scanner.nextLine();
//             if(userLocations.contains(userInput)){
//                 System.out.println("You have already visited this location. Please pick another location");
//             } else if (userInput.toLowerCase().equals("yamanashi")){
//                 System.out.println("Headed to Yamanashi...");
//                 scanner.nextLine();
//                 Site site = new Site();
//                 site.Yamanashi();
//                 userLocations.add(userInput);
//                 break;
//             // } else if (userInput.toLowerCase().equals("Nara")){
//             //     Site site = new Site();
//             //     site.Nara();
//             //     userLocations.add(userInput);
//             //     break;
//             } else {
//                 System.out.println("Sorry, that location does not exist. Where would you like to go?");
//             }
//         }
//         // scanner = new Scanner(System.in);

//     }

//     // }
// }
