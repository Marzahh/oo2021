import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//example of work with HashMap

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap <String, Integer>();
        map.put("key0",2);
        map.put("key1",28);
        map.put("key2",34);
        map.put("key3",5);
        map.put("key4",10);

        boolean removed = map.remove("key1") != null;
        System.out.println("Element with key1 was removed if true: " + removed);

        for(Integer k : map.values()){
            System.out.println(k); //prints out all the elements in random order
        }
        Set<String> strings = map.keySet();
        for(String k : strings){
            System.out.println(k); //prints out all the keys in random order
        }

        System.out.println( map.containsKey("key2")); // will say true as key2 exists
    } 
} 