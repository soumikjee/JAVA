
//        *******
//       *     *
//      *     *
//     *     *
//    *     *
//   *     *
//  *******

import java.util.Scanner;

public class Star24 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");

        int n = sc.nextInt();

        int stars=n;
        int spaces=n-1;

        for(int i=1;i<=n; i++){
            for(int j =1;j<=spaces;j++){
                System.out.print(" ");               
            }
            for(int k=1;k<=stars;k++){
                if((i==1)||(k==1)||(k==stars)||(i==n)){
                    System.out.print("*");                   
                }else{
                    System.out.print(" ");
                }

            }
            spaces--;
            stars=n;
            System.out.println();
        }
    }
    
}
