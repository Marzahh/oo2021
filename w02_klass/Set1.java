import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

// HashSet example

public class Set1 {



    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); //will NOT order it´s element internaly once gone through iterator
        set.add("Hello");
        set.add("Moon");
        set.add("Tulip");
        set.add("1");
        set.add("4");

        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);

        boolean Added = set.add("Hello");
        System.out.println(Added); //will return false as it will try to add a repeating value

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}