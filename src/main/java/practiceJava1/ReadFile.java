package practiceJava1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadFile {
        public static void main(String[] args) throws IOException {


            Map<String,String> gfg = new HashMap<String,String>();

            // enter name/url pair
            gfg.put("GFG", "geeksforgeeks.org");
            gfg.put("Practice", "practice.geeksforgeeks.org");
            gfg.put("Code", "code.geeksforgeeks.org");
            gfg.put("Quiz", "www.geeksforgeeks.org");

            // forEach(action) method to iterate map
            String s = gfg.entrySet().stream().filter(x-> x.getValue().equals("www.geeksforgeeks.org")).map(x -> x.getValue()).collect(Collectors.joining());
            System.out.println(s);
            //gfg.forEach((k,v) -> System.out.println(k + v));


            // One way
//            String file = "file.txt";
//            Path path = Paths.get(file);
//            Stream<String> lines = Files.lines(path);
//
//            lines.forEach(s -> System.out.println(s));
//            lines.close();

            //Another way using BufferReader
//            String file1 = "file.txt";
//            Path path1 = Paths.get(file1);
//            BufferedReader bufferedReader = Files.newBufferedReader(path1);
//
//            String curLine;
//            while ((curLine = bufferedReader.readLine()) != null){
//                System.out.println(curLine);
//            }
//            bufferedReader.close();
        }
}
