package w08_alamklassid.homeworkAnimals;


public class Puppy extends Animal{


    public Puppy(String name, String food) {
        super(name, food);
    }

    public void firstThingIDo(){
        System.out.println("I Bark first thing in the morning. And wait for food.");
    }
    
    @Override
    public void favouriteFoodIs() {
        super.favouriteFoodIs();
        System.out.println("I don´t have favorite food");
    }
}
