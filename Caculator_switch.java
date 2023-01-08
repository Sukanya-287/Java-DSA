import java.util.Scanner;

public class Caculator_switch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Enter the arithmatic Operatio need to do");
        char op = in.next().charAt(0);

        switch(op){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}
