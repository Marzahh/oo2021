package w08_alamklassid.homeworkAnimals;


public abstract class Animal {
    public String name;
    public String food;

    public Animal (String name, String food){
        this.name = name;
        this.food = food;
    }

    public void favouriteFoodIs(){
        System.out.println(this.name + "'s favourite food is " + this.food);
    }
}
