

import java.util.Scanner;

public class Am {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = sc.nextInt();

        int amstar = n;

        int cub=0;

        while(n!=0){

            int store = n%10;

            cub = cub+ (store*store*store);
        
            n=n/10;
        }

        if(cub==amstar){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

    }
    
}
