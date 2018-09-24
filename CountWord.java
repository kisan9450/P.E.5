import java.sql.SQLOutput;
import java.util.*;

public class CountWord {
    public String countWords(String input)
    {   input=input.replaceAll("[^a-zA-Z]"," ");
        String[] splitString=input.split("\\s+");
        Map<String,Integer> output=new HashMap<String,Integer>();
        int count = 0;
        for(String s:splitString) {
            if (output.containsKey(s))
            {
                count=output.get(s)+1;
            }
            else
            {
                count=1;
            }
            output.put(s,count);
        }
        String object=output.toString();
        return object;
    }
}

