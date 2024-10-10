
//      1
//     123
//    12345
//   1234567
//  123456789

import java.util.Scanner;

public class Num5 {

public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number : ");

    int n = sc.nextInt();

    int spaces = n-1;

    int num=1;


    for(int i=1;i<=n;i++){
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=num;k++){
            System.out.print(k);
            }
        spaces--;
        num=num+2;
        System.out.println();              
        }
        
    }

}
    

