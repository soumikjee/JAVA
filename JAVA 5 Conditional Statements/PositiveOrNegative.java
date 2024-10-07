// check number positive(+) or negative(-)

import java.util.Scanner;

public class PositiveOrNegative{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n =sc.nextInt();

        if(n>0){
            System.out.println("This Number Positive");
        }else{

        System.out.println("This Number Negative ");
        }
    }

}