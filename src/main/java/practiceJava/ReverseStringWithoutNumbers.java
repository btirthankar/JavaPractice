package practiceJava;

import java.util.HashMap;
import java.util.Map;

public class ReverseStringWithoutNumbers {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        String a = "1@^J5G4F8";
        String b = "";
        int count = 0;
        for (int i = a.length()-1; i>=0;i--){
            if(Character.isAlphabetic(a.charAt(i))) {                b = b + a.charAt(i);
            }
            else{
                map.put(count,a.charAt(i));
            }
            count++;
        }
        if(map.size()!=0) {
            for (Map.Entry<Integer, Character> m : map.entrySet()) {
                Character c = m.getValue();
                String initial = b.substring(0,b.length()-(m.getKey()));
                String addNumber = ""+m.getValue();
                String endingValue = b.substring(b.length()-(m.getKey()));
                    b =initial+addNumber+endingValue;
             }
            }
        System.out.println(b);
        }
     }