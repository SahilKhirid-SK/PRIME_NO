import java.util.*;
public class prime {
    public static void main(String args[]){
       

        Scanner sc=new Scanner(System.in);
        
      do{ 
        System.out.println("Enter the number"); 
        
        
        int no=sc.nextInt();
        if(no==2)
        {
            System.out.println("Prime");

        }
        else{
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(no); i++){
                if(no%i==0){
                isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("No is not prime");
            }
        
    }
   }while(true);
}
}
