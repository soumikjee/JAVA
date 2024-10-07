
// Factorial (5) = 5  * 4 * 3 * 2 * 1 

import java.util.Scanner;

public class Factorial {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");

        int n = sc.nextInt();

        int store=1;


        for(int i = 1 ; i<=n ; i++ ){
          
            store = store*i;               

            System.out.println(store); 
        }
      
    }
    
}
