import java.util.*;
public class ArrayListEg {
    public List<String> change(List<String> input){
        Collections.replaceAll(input,"Apple","Kiwi");
        Collections.replaceAll(input,"Melon","Mango");
        return input;
    }
}
