
//using scanner class

import java.util.Scanner;

public class U {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number :");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("(a+b)^2:" + (a ^ 2 + b ^ 2 + 2 * a * b));

    }

}
