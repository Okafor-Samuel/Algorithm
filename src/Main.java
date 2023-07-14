import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String [] inputArray = {"da", "rope", "feet", "da", "ropes", "rope", "da"};
        String [] queryArray = {"da", "rope", "feet", "cup"};

        Map<String, Integer> hashmap = new HashMap<>();
        for (String x : queryArray)
            hashmap.put(x, 0);

        for (String y : inputArray){
         if (hashmap.containsKey(y)) {
             hashmap.put(y, hashmap.get(y) + 1);
         }
         }
        System.out.println(hashmap);
        }
}