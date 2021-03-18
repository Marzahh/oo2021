package w06_liides.homeworkAnimals;

public class Puppy implements Animal{

    @Override
    public String speak() {
        System.out.println("wuf-wuf! I´m a big dog. ");
        return null;
    }

    @Override
    public String eat() {
        System.out.println("I´m eating my puppy food. ");
        return null;
    }

    @Override
    public String sleep() {
        System.out.println("zzzZzz(dreaming about chasing cats) ");
        return null;
    }

    @Override
    public String beSneaky() {
        System.out.println("Hmm what slipper should I chew on next?? ");
        return null;
    }

    @Override
    public String lookAround() {
        System.out.println("I´m looking around");
        return null;
    }

    @Override
    public String attack() {
        System.out.println("Damage to the neighbour has been made");
        return null;
    }
    
}
