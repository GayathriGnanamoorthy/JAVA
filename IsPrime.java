package MYCAPTAIN;
import java.util.*;
class CheckIsPrime{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Please insert any number");
        int num = ob.nextInt();
        boolean isPrime = false;
        for(int i=2;i<num/2;++i){
            if (num % i==0){
                isPrime = true;
                break;
            }
        }
        if(!isPrime)
        System.out.println(num+ " is a prime number");
        else
        System.out.println(num+ " is not a prime number");

        
    }

}
