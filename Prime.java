import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a num");
        int n = in.nextInt();
        int div=2;
        while(div<n){
            if(n%2==0){
                System.out.println("not prime");
                return;
            }
            else{
                div = div+1;
            }
        }
        System.out.println("prime");
    }
}
