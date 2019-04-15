package q1;
import java.util.Scanner;
 
public class Q1 {
    public final static Scanner x =new Scanner(System.in);
    static char lookahead;
    public static char gettoken(){
        return lookahead=nextchar (x);
    }
    public  static char nextchar(Scanner input)
    {
        input.useDelimiter(",\\s*");
         char t= input.next().charAt(0);
         input.reset();
                 return t;    
    }
   public static void S()
    {
       switch(lookahead)
       { 
            case'a':
                gettoken();
                break;
                 case'+':
                 case'-':
                    gettoken();
                S();
                S();
                break;
            default:
                System.err.println("syntax errer");             
        }
}

 public static void main(String[] args){
 while(true)
{
System.out.println("enter code=");
System.out.println("hello,sa n.txt".replaceAll("[, ;]", ""));
System.out.flush();
gettoken();
S();
    }
    

 }
}
