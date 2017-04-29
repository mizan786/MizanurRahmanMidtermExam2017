package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {


        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        System.out.println("Repeated words in the string" );
        String [] str = st.split(" ");
        Map<String, Integer> strMap = new HashMap();
        for (String string:str){
            if(strMap.get(string)!=null){
                strMap.put(string, strMap.get(string)+1);
            }else{
                strMap.put(string, 1);
            }
        }
       Set<String> str2 = strMap.keySet();
        for (String string2:str2){
            if (strMap.get(string2)>1){
                System.out.println(string2 + ": number of occurences : "+strMap.get(string2));
            }
        }
    }
}
