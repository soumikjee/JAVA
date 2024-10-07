

import java.util.Scanner;

public class SmallestNum{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number a: ");
        int a = sc.nextInt();

        System.out.println("Enter Number b:");
        int b = sc.nextInt();


        if(a<b){
            System.out.println("a Smallest");
        }else{
            System.out.println("b smallest");
        }
    }
}
    