package w06_liides.homeworkAnimals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Kitty();
        Animal dog = new Puppy();


        cat.eat();
        cat.sleep();
        cat.speak();
        cat.attack(); //same
        System.out.println();
        dog.attack(); //same
        dog.beSneaky();
        dog.lookAround();
    }
}
