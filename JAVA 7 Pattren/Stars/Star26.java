
//      *
//     **
//    ***
//   ****
//  *****
//   ****
//    ***
//     **
//      *

import java.util.Scanner;

public class Star26 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");

        int n=sc.nextInt();

        int spaces = n/2;
        int stars= 1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=spaces;j++ ){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++){
                System.out.print("*");
            }

            if(i<=n/2){
                spaces--;
                stars=stars+1;
            }else{
                spaces++;
                stars=stars-1;

            }
            System.out.println();
        }

    }
    
}
