package w03_klassikomplekt;

public class StaticAndFinalLesson{
    public static void main(String[] args) {
        Human h1 = new Human("Alex", 20);
        h1.printNumberOfPeople();
        Human h2 = new Human("Marie", 23);
        Human h3 = new Human ("Alexa", 100);
        h1.printNumberOfPeople();
        h3.printNumberOfPeople();

        final int DANCE =2; // constant names are with cap letters
        System.out.println(DANCE);
    }


}

class Human{


    public static final int CONSTANT = 10; //is a constant and can not be changed in any way

    private String name;
    private int age;
    public static int countPeople; //works over all objects created and gives them a common value

    public Human(String name, int age){

        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void printNumberOfPeople(){ //only works with static value
        System.out.println("Currentnumber of people created is "+countPeople);
    }


}