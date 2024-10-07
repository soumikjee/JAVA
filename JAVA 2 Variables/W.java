
//static var acess ( class name . var_name)

class W {

    static int  a = 19;  //static var
    public static void main (String []args){

        
        System.out.println(W.a); 
        W.a = 30;
        System.out.println(W.a);
        W.a= W.a +20;
        System.out.println(W.a);
    }
}