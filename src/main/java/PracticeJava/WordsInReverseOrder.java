package PracticeJava;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        String a = "my Name Is Tirthankarm";
        String[] nameArray = a.split(" ");
        String newString = "";
        for (int i = nameArray.length-1;i>=0;i--){
            newString=newString + " "+nameArray[i];
        }

        System.out.println(newString.trim());

        System.out.println(a.indexOf('m', a.indexOf('m')+2));
    }
}
