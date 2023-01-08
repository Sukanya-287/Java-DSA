import java.util.Scanner;

public class Prime01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();

        boolean isPrime = true;
        if(n == 2){
            System.out.println("Is prime number");
        }else{
            for(int i=2; i<Math.sqrt(n); i++){
                isPrime =false;
            }
        }

        if(isPrime == true){
            System.out.println("Is prime number");
        }else{
            System.out.println("Is not a prime number");
        }
    }
}
