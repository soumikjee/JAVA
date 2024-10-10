
//  123456789
//   1234567
//    12345
//     123
//      1

import java.util.Scanner;

public class Num6 {

    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number :");

        int n=sc.nextInt();

        int num=n+4;
        int spaces=n-2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++){
                System.out.print(k);
            }

            spaces++;
            num=num-2;
            System.out.println();
            
        }

    }
    
}
