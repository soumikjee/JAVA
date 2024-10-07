
//Number is Single Digit or Not

import java.util.Scanner;

public class SingleDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number");
        int a =sc.nextInt();

        if(a<10 && a>=0){
            System.out.println("Singel Digit");
        }else{
            System.out.println("Not Single Digit");
        }
        
    }
    
}
