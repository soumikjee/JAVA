
import java.util.Scanner;

public class Week {

    public static void main (String[]args){


    Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number");
       int a = sc.nextInt();

       switch(a) {

        case 1 :System.err.println("SUNDAY ");
        break;
        case 2 :System.err.println("MONDAY");
        break;
        case 3 :System.err.println("TUESDAY ");
        break;
        case 4 :System.err.println("WEDNESDAY ");
        break;
        case 5 :System.err.println("THURSDAY ");
        break;
        case 6 :System.err.println("FRIDAY");
        break;
        case 7 :System.err.println("SATURDAY ");
        break;
        default : System.out.println("Error ");

       }
       
    }
    
}
