import java.util.Scanner;

public class Sum_n_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int i=1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
