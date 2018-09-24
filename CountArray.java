import java.util.HashMap;
import java.util.Map;

public class CountArray {
    public String countArray(String input[]){
        Map<String,Boolean> output=new HashMap<String,Boolean>();
        Map<String,Integer> checkNoOf=new HashMap<String, Integer>();
        int count=0;
        for(String s:input){
            if(checkNoOf.containsKey(s)){
                count=checkNoOf.get(s)+1;
            }
            else
            {
                count=1;
            }
            checkNoOf.put(s,count);
            if(checkNoOf.get(s)>1)
                output.put(s,true);
            else
                output.put(s,false);
        }
        return output.toString();
    }
}