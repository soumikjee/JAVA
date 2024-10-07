//Automorphic number 
import java.util.Scanner;

public class Automorphic {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number : ");

        int n =sc.nextInt();

        int sqe = n*n;

        boolean flag = true;          //n=25 n%10=5 
                               // sqe=625 sqe%10=5
        while(n>0){
            if(n%10 != sqe%10){

                flag=false;
                break;
            }
            n=n/10;
            sqe=sqe/10;  
        }
        if(flag==true) System.out.println("Automorphic");
        else System.out.println("Not Automorphic");
        
    }
    
}
