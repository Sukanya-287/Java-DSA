import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Tax_calculator{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your salary");
        float salary = in.nextFloat();
        if(salary <500000){
            System.out.println("No tax is needed");
        }
        else if(salary >= 500000 && salary <=1000000){
            System.out.println("tax = "+(salary * 0.2));
    }
        else{
            System.out.println("Tax = "+(salary * 0.3));
    }
}
}
