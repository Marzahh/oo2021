package w08_alamklassid.homeworkAnimals;


public class Kitty extends Animal{


    public Kitty(String name, String food) {
        super(name, food);
    
    }

    public void firstThingIDo(){
        System.out.println("I meow first thing in the morning. And cuddle.");
    }
    
    @Override
    public void favouriteFoodIs() {
        super.favouriteFoodIs();
        System.out.println("I don´t have favoritr food, maybe...   " + this.food);
    }

    
}
