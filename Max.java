
import java.util.Scanner;
class Max{
    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is greater - " + a);
            }
            else{
                System.out.println("a is greater - " + c);
            }
        }
        else{
            if(b>c){
                System.out.println("a is greater - " + b);
            }
            else{
                System.out.println("a is greater - " + c);
            }
        }
    }
}