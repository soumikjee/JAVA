
//  *
//  **
//  ***
//  ****
//  *****
//  ****
//  ***
//  **
//  *

import java.util.Scanner;

public class Star25 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");

        int n = sc.nextInt();

        int stars = 1;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=stars; j++){

                System.out.print("*");
            }
            
            if(i<=n/2){
                stars=stars+1;
            }else{
                stars=stars-1;
            }
            System.out.println();
        }


    }
    
}
