class X {

    static int a = 10;
    public static void main (String []args)

    {
        System.out.println(X.a);
        X.a = 20;
        System.out.println(X.a);
        X.m1();
    }
    public static void m1 ()
    {
        X.a = X.a + 40;
        System.out.println(X.a);
        System.out.println(" Static Var ");
    }
}