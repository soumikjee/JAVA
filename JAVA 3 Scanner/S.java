
//Java User Input (Scanner) 

import java.util.Scanner; // Import the Scanner class

class S {
    public static void main( String []args){
         Scanner obj = new Scanner(System.in); {

            System.out.println("Enter Two number :" );

            int a = obj.nextInt();
            int b = obj.nextInt();
            
            System.out.println( a+b );
            System.out.println( a-b );
            System.out.println( a*b );
            System.out.println( a/b );
        }
    }
}
/*
nextBoolean()	Reads a boolean value from the user
nextByte()	    Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	    Reads a float value from the user
nextInt()	    Reads a int value from the user
nextLine()	    Reads a String value from the user
nextLong()	    Reads a long value from the user
nextShort()	    Reads a short value from the user
 */