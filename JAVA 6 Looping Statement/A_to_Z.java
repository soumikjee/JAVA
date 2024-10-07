//print n /user input to Z

import java.util.Scanner;

public class A_to_Z {

    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Char :");

    char ch = sc.next().charAt(0);

    for( char i =ch ; i<='Z' ; i++){

        System.out.print( i );

        }

    }
}
