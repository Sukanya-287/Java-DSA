public class Reverse {
    public static void main(String[] args) {
        int  n= 10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);   // OR rev=0; rev = (rev*10)+lastDigit;
            n= n/10;
        }
        
    }
}
