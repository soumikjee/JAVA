
//  888888888
//   6666666
//    44444
//     222
//      0


import java.util.Scanner;

public class Num10 {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number :");

        int n = sc.nextInt();

        int spaces=n-1;
        int num=n+4;

        for(int i=1,p=n+3;i<=n;i++,p=p-2){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++){
                System.out.print(p);
            }
            spaces++;
            num=num-2;
            System.out.println();
        }

    }
    
}
