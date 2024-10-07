 
// Scanner class.
import java.util.Scanner;
 

public class Scanner_All {
      
   
    public static void main(String[] args)
    {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name:");
        String name = sc.nextLine();

        System.out.println("enter gender");
        char gender = sc.next().charAt(0);

        System.out.println("enter age: ");
        int age = sc.nextInt();

        System.out.println("enter phno: ");
        long mobileNo = sc.nextLong();

        System.out.println("enter cgpa");
        double cgpa = sc.nextDouble();
 
    
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
    }