import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

// TreeSet example

public class Set2 {

    public static void main(String[] args) {


        Set<String> set = new TreeSet<>(); //will order it´s element internaly once gone through iterator
        set.add("Hello");
        set.add("Sun");
        set.add("Flower");
        set.add("1");
        set.add("4");

        boolean isEmpty = set.isEmpty(); // will return false as it is not empty
        System.out.println(isEmpty);

        boolean Added = set.add("Hello");
        System.out.println(Added); //will return false as it will try to add a repeating value

        Iterator<String> iterator = set.iterator(); //returns sorted list
        while(iterator.hasNext()) {
        String next = iterator.next();
        System.out.println(next);
        }


    }
}
