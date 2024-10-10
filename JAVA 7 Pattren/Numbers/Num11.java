
//  1
//  22
//  111
//  2222
//  11111
//  222222
//  1111111

import java.util.Scanner;

public class Num11 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number: ");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                if(i%2==0){

                System.out.print(2);
                }else{
                    System.out.print(1);
                }

            }
            System.out.println();
        }


    }
    
}
