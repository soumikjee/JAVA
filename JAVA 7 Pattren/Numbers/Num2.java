
//  54321
//  5432
//  543
//  54
//  5

import java.util.Scanner;

public class Num2 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number :");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n; j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }
    
}
