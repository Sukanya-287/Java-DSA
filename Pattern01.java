/* 
1 Line(4) - outer loop --> 4times
2 number of times(i)
    inner loop --> i times
3 print * */


class Pattern01{
    public static void main(String[] args) {
        int line =4;
         for(line=1; line<=4; line++){
            for(int star=1; star <= line; star++){
                System.out.print( " * ");
            }
            System.out.println();
         }
    }
}