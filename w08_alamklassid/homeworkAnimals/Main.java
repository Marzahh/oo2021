package w08_alamklassid.homeworkAnimals;



public class Main {
    public static void main(String[] args) {
        Kitty cat = new Kitty("Tom", "Milk");
        Puppy dog = new Puppy("Jerry", "Meat");

        
        cat.favouriteFoodIs();
        cat.firstThingIDo();
        System.out.println(cat.name);

        System.out.println();

        dog.favouriteFoodIs();
        dog.firstThingIDo();
        System.out.println(dog.name);
    }
}
