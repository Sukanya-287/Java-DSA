public class Type_casting {
    public static void main(String[] args) {
        // char a='z';
        // char b='b';
        // System.out.println(a-b); 

        // byte a = 4;
        // char b = 'a';
        // short c= 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f*b)+(i%c)-(d*c);
        // System.out.println(result);
        // int $ = 7;
        //  System.out.println($);

        // int x = 2;
        // int y = 5;
        // int a = (x*y/x);
        // int b = (x* (y/x));
        // System.out.println(a);
        // System.out.println(b);

        // int x = 200 , y= 50, z = 100;
        // if (x<y && y>z){
        //     System.out.println("Hello");
        // }
        // if (z>y && z<x){
        //     System.out.println("Java");
        // }
        // if ((y+200)< x && (y+150)<z){
        //     System.out.println("Hello Java");
        // }
int x= 4, y=2;
        int a = (x*(x/y + x/y));
        int b = (x*x/y+x/y);
        System.out.println(a);
        System.out.println(b);
    }
}