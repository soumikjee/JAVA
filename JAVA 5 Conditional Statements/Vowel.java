

//Check Number Is Vowel  or Not

import java.util.Scanner;

public class Vowel {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Char : ");
         char c = sc.next().charAt(0);


         if( c== 'a' || c== 'e'|| c=='i' || c=='o'|| c=='u' ){

            System.out.println(" Number is Vowel");
    

         }else{
            System.out.println("Not a Vowel Number");
         }
    }
    
}
