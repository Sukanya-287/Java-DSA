import javax.sound.sampled.SourceDataLine;

class Turnary{
    public static void main(String[] args) {
        int marks = 30;
        String result = (marks>=35)? "Pass" : "Fail";
        Boolean val = (marks>=35)? true : false;
        System.out.println(val);
        System.out.println(result);
    }
}