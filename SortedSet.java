import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
    public String sortTheSet(String[] input)
    {
        Set<String> output=new TreeSet<>();
        for(String s:input){
            output.add(s);
        }
        ArrayList<String> outputValue=new ArrayList<>(output);
        return outputValue.toString();
    }
}
