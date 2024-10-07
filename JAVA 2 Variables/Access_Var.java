
//static var acess ( class name . var_name)

class Access_Var {

    static int  a = 19;  //static var
    public static void main (String []args){

        
        System.out.println(Access_Var.a); 
        Access_Var.a = 30;
        System.out.println(Access_Var.a);
        Access_Var.a= Access_Var.a +20;
        System.out.println(Access_Var.a);
    }
}