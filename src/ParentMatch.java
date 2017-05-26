import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

/**
 * Created by kirtanpatel on 2/2/17.
 */
public class ParentMatch {



    public static boolean checkParen(String expression){
        Stack<Character> stack =  new Stack<Character>();

        for(int i = 0; i< expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                try {
                    stack.pop();
                }catch(NoSuchElementException r){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        try {//try will help contain exception
            //try surround the calling fo method taht might throw an exception witha try block
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Buffer for characters
            System.out.println("Please enter the expression");
            String expr = br.readLine();

            if(checkParen(expr)){
                System.out.println("Matched");
            }else{
                System.out.println("Not Matched");
            }

        } catch (IOException e){

        }


    }


}
