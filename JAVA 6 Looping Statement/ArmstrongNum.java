import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.print("Enter a num: ");

        int n = sc.nextInt(); // n= 153 (armstrong number)
       
        int num = n;
        int count=0;
        int sum =0;
        int mul = 1; // (1 *2=2 or 0 *2=0) 

        while (n>0) { // 153 - 15 - 1 
            count++; // count = count+1 // 0+1 -- 1+1=2 -- 2+1= 3(count)
            n/=10;  // 153/10 =15 -- 15/10=1 -- 1/10=0    
        }
        
        n = num; // n=0 / n=153 / n=153 
        while (n>0) { // 153>0 
            int rem = n%10; // 153%10=3
           
            for(int i=1;i<=count;i++){
                mul*=rem;// mul=mul*rem // mul = 1*3 ->- mul =3*3 ->- mul =9*3 ->- mul =27
                                        //mul = 1*5 ->- mul =5*5 ->- mul =25*5 ->- mul =125
                                        //mul = 1*1 ->- mul =1*1 ->- mul =1*1 ->- mul =1
            }
            sum += mul; //sum =sum+mul
                       //sum =0+27 ->- 27+125  ->- 152+1 = 153(sum)

            n/=10; // 153/10 =15
                  // 15/10=1
        }
        if(sum==num){ //153=153
            System.out.println(num+ " is Armstrong number");
        }else{
            System.out.println(num+ " is not Armstrong number");
        }
    }
    
}