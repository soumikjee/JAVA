//  *     
//  **
//  * *
//  *  *
//  *   *
//  *    *
//  *     *
//  *      *
//  *       *
//  **********    i=n || j=1 || j=i 




import java.util.Scanner;

public class Star15 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number :");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j =1 ; j<=i ; j++){
                if((i == n ) || (i==j) || (j==1 )){
                    System.out.print("*");
                }else System.out.print(" ");
            }System.out.println();
        }
        
    }
    
}
