public class Product {
    int multiply(int a, int b){
        int product = a*b;
        System.out.println("Product of "+ a+" and "+b+" is "+product);
        return product;
    }
    public static void main(String[] args) {
        Product obj = new Product();
        obj.multiply(5,6);
    }
}
