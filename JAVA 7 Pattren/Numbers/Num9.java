
//      0
//     222
//    44444
//   6666666
//  888888888

import java.util.Scanner;

public class Num9 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");

        int n=sc.nextInt();

        int spaces = n-1;
        int num=1;

        int p =0;
        for(int i=1;i<=n;i++){
            p=p+2;   // 0+2 // 2+2 // 4+2 //
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }for(int k=1;k<=num;k++){
                System.out.print(p);
            }

            spaces--;
            num=num+2;
            System.out.println();
        }

    }
    
}
