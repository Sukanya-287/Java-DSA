import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        switch(num){
            case 1 : System.out.println("It's Sunday");
            break;
            case 2 : System.out.println("It's Tuesday");
            break;
            case 3 : System.out.println("It's Wednesday");
            break;
            case 4 : System.out.println("It's Thursday");
            break;
            case 5 : System.out.println("It's Friday");
            break;
            case 6 : System.out.println("It's Saturday");
            break;
            case 7 : System.out.println("It's Sunday");
            break;
            default:
            System.out.println("Invalid Number");
        }
    }
}
