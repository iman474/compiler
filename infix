
package q2;

import java.io.*;
import java.io.IOException; 

public class Q2 {
int lookahead;
    BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    public void expr() throws IOException{
        term();
        while(true){
        if(lookahead== '+' )
        {
            match('+');
            term();
            System.out.write('+');
        }
        else if(lookahead == '-' )
        {
            match('-');
            term();
            System.out.write('-');
        }
    else 
             return;
        }
    }

    private void term() throws IOException {
        factor();
         while(true){
        if(lookahead== '*' )
        {
            match('*');
            factor();
            System.out.write('*');
        }
         else if(lookahead == '/' )
        {
            match('/');
             factor();
            System.out.write('/');
        }
        else if ((char) lookahead == '(') {
                match('(');
                expr();
                match(')');
            }
    else 
             return;
        }
    }
    
    private void factor() throws IOException {
        if(Character.isDigit((char)lookahead))
        {
          System.out.write((char)lookahead);
            match(lookahead);
    }
      else {
          
              System.out.print("\nSyntax Error.");
    
        }
        
    }
  void match (int t)throws IOException{
        if(lookahead ==t)
          lookahead=System.in.read();
        
        else
        throw new Error("Syntax error");
        
            
    }

    public static void main(String[] args) throws IOException {
         Q2 obj= new Q2();
         obj.expr();
         System.out.write('\n');
      
    } 
   }
 
