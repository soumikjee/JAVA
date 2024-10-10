
//      1   
//     222
//    33333
//   4444444
//  555555555


import java.util.Scanner;

public class Num8 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");

        int n = sc.nextInt();

        int spaces=n-1;
        int num=1;
        

        for(int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }for(int k=1;k<=num;k++){
                System.out.print(p);
            }
            num=num+2;
            spaces--;
            System.out.println();
        }
    }
    
}
