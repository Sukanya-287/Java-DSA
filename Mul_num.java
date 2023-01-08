import java.util.Scanner;

public class Mul_num {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            num = in.nextInt();
            if (num%10 == 0){
                break;
            }
            else{
                System.out.println(num);
            }
        }while(true);
        System.out.println("We got the multiple of 10");
    }
}
