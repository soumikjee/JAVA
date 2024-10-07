import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        int originalNumber = number;

        // Loop to check if the number is happy or not
        while (number != 1 && number != 4) {
            int sum = 0;
            
            // Inner loop to calculate the sum of squares of digits
            while (number > 0) {
                int digit = number % 10;  // Extract the last digit
                sum += digit * digit;     // Square the digit and add to sum
                number /= 10;             // Remove the last digit
            }

            // Update the number to be the sum of squares of its digits
            number=sum;
          
        }

        // After exiting the loop, check if the number is 1 or 4
        if (number == 1) {
            System.out.println(originalNumber + " is a Happy number.");
        } else {
            System.out.println(originalNumber + " is not a Happy number.");
        }
    }
}