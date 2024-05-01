import java.util.ArrayList;
import java.util.List;

/**
 * Class Inventory stores and displays how many tokens players have so far 
 */
public class inventory<Token> {
    private List<Token> tokens;       

    public inventory() {
        tokens = new ArrayList<>();  
    }

    public void addToken(Token token) {
        tokens.add(token); 
    }

    public void displayToken() {
        System.out.println("You have"); 
        for (Token Token : tokens) {
            System.out.println(Token + "tokens"); 
        }
    }
}
