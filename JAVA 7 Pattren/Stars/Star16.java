
//  **********
//  *       *
//  *      *
//  *     *
//  *    *
//  *   *
//  *  *
//  * *
//  **
//  *


import java.util.Scanner;

public class Star16 {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number :");

        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            for(int j =1; j<=n; j++){
              
                if((i+j)==(n+1)||(j==1)||(i==1)){
                    System.out.print("*");
                }else System.out.print(" ");
            }System.out.println();
        }
    }

    
}
