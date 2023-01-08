public class Sum {
    public static void main(String[] args) {
        int sum=0,count=0;
        int n=5;
            for(int i=0; i<n+1; i++){ 
                sum= sum+i;
                count++;
            }
        System.out.println(sum +" "+ count);
    }
}
