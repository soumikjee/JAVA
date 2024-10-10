
// *********
//  *     *
//   *   *
//    * *
//     *



import java.util.Scanner;

public class Star22 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");

        int n = sc.nextInt();

        int spaces =n-1;
        int stars =n+4;

        for(int i = 1; i<=n ;i++){
            for(int j=1;j<=spaces ; j++){
                System.out.print(" ");
            }for(int k=1 ; k<=stars ;k++){
                if((i==1)||(k==1)||(k==stars)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
               
            }
            spaces++;
            stars=stars-2;
            System.out.println();
        }        

    }
    
}
