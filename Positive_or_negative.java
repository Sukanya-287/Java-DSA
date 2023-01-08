import java.util.Scanner;

public class Positive_or_negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if(num<=0){
            System.out.println("It's a negative number");
        }else{
            System.out.println("It's a positive number");
        }
    }
}
