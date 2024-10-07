
//++ a & a++ operators

public class O {

    public static void main(String[]args){

        int a = 0;  // a = 3+1
        int b = ++a; // b = 1 a = 1  
        int c = a++; // c= 1  a = 2
        int d = ++a + a++; // d = 3 + 3 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}