
//static var , non static var , local var 

class  All_Var {

    static int a; //static var
    int b;       //non static var
    public static void main (String []args){

        int c;  //local var
        c=30;

        All_Var.a = 10; // Call Static Var
        System.out.println(All_Var.a); // print 10
        All_Var a1 =  new All_Var(); //create object for class 
        a1.b=20;
        System.out.println(a1.b); // print  20
        System.out.println(c); // print  30

        
    }
}