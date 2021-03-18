package w06_liides.homeworkAnimals;

public class Kitty implements Animal{

    @Override
    public String speak() {
        System.out.println("Meoooow ");
        return null;
    }

    @Override
    public String eat() {
        System.out.println("My fish tastes good today! I´m eating");
        return null;
    }

    @Override
    public String sleep() {
        System.out.println("ZzzzZZ (Dreaming about playing with the ball on the string) ");
        return null;
    }

    @Override
    public String beSneaky() {
        System.out.println("Planning to jump from that tree to that roof now.");
        return null;
    }

    @Override
    public String lookAround() {
        System.out.println("Looking around for birds to chase.");
        return null;
    }

    @Override
    public String attack() {
        System.out.println("Damage to the couch has been made");
        return null;
    }
    
}
