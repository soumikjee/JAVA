
// non static var

class Non_Static {

    int a; //non static var
    int b;  //non static var
    public static void main ( String []args){

        Non_Static b1 = new Non_Static();
         b1.a = 10;
         b1.b = 20;
        System.out.println(b1.a); // prints 10
        System.out.println(b1.b); // prints 20
        

    }
}