
//static var , non static var , local var 

class  Z {

    static int a; //static var
    int b;       //non static var
    public static void main (String []args){

        int c;  //local var
        c=30;

        Z.a = 10; // Call Static Var
        System.out.println(Z.a); // print 10
        Z a1 =  new Z();
        a1.b=20;
        System.out.println(a1.b); // print  20
        System.out.println(c); // print  30

        
    }
}