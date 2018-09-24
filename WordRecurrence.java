import java.util.HashMap;
import java.util.Map;

public class WordRecurrence {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> recurrence = new HashMap<String, Boolean>();
        Map<String,Integer> countEle=new HashMap<>();
        int count=0;
        for(String str:arr)
        {
            if(countEle.containsKey(str))
            {
                count=countEle.get(str)+1;
            }
            else
            {
                count=1;
            }
            countEle.put(str,count);
            if(countEle.get(str)>1)
            {
                recurrence.put(str, true);
            }
            else
            {
                recurrence.put(str, false);
            }
        }
        System.out.println(recurrence);

    }
}