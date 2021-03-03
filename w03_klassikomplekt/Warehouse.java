package w03_klassikomplekt;

import java.util.ArrayList;

class Warehouse {
    
    ArrayList<String> modificate(ArrayList<String> love) {
    ArrayList<String> evenmoremagical = love;
    evenmoremagical.add("Fujitsu");
    //((Object) evenmoremagical).delete("LG"); need to make those 2 work as well
    //evenmoremagical.contains("LG");

    return evenmoremagical;

    }
}
