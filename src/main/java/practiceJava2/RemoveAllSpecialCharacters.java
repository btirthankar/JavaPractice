package practiceJava2;

public class RemoveAllSpecialCharacters
{
    public static void main (String[] args)
    {
        String str = "Hello^^%#$(!)_+ Tirt#ha@nkar";
        System.out.print(removeSpecialCharacters(str));
    }

    private static String removeSpecialCharacters(String str)
    {
        String newStr = str.replaceAll("[%^#$()!_+@]", "");
        return newStr;
    }

}
