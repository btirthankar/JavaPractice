package practiceJava1;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] intArray = new int[]{1,2,3,4,4,9,7,8,9,10};
        int temp = 0;
        for (int i =0; i<intArray.length;i++){
            int count = 1;
            temp =intArray[i];
            for(int j = i+1; j<intArray.length;j++){
                if(temp== intArray[j]){
                    count++;
                }
            }
            if(count>1){
                map.put(temp, count);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        System.out.println("Key = " + entry.getKey() +
                ", Value = " + entry.getValue());
    }
}
