
//Age is Eligible or not 

import java.util.Scanner;

public class Age {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Name :");
    String a =sc.nextLine();

    System.out.println("Enter Age :");
    int b = sc.nextInt();

    if(b>=25 && b<=35){

        System.out.println("You Are Eligible ");
    }else{
        System.out.println("Not Eligible ");
    }

    }
    
}
