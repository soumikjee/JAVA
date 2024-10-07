
//Character To ASCII Converter

import java.util.Scanner;

public class ASCII {

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Char :");
        int ch = sc.next().charAt(0);

        int a = ch;

        System.out.println("ASCHII valur is " + a);
    }
    
}
