package w03_klassikomplekt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fridge lovenumbers = new Fridge();
        ArrayList<String> getlovenumbers = lovenumbers.magicnumbers();
        System.out.println(getlovenumbers);

        Warehouse magichappened = new Warehouse();
        ArrayList<String> changed = magichappened.modificate(getlovenumbers);

        System.out.println(changed);
        
    }

}
