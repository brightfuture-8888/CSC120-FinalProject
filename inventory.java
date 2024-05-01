import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

public class inventory<Token> {
    private List<Token> tokens;

    public inventory(){ 
        tokens = new ArrayList<>();
    }

    public void addToken(Token token){
        tokens.add(token);
    }
    public void displayToken(){
        System.out.println("Inventory Tokens:");
        for (Token Token : tokens){
            System.out.println(Token);
        }
    }
}
