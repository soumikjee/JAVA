
// non static var

class Y {

    int a; //non static var
    int b;  //non static var
    public static void main ( String []args){

        Y b1 = new Y();
         b1.a = 10;
         b1.b = 20;
        System.out.println(b1.a); // prints 10
        System.out.println(b1.b); // prints 20
        

    }
}