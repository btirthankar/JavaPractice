package practiceJava1;

public class RegularExpression {

    public static void main(String[] args) {
        String a = "#@#@T#$ #SD-S434.)(*";
        a=a.replaceAll("[^0-9 a-zA-Zs_.-]","");
        System.out.println(a);
    }
}
