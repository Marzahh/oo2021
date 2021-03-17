package w06_liides;

public class Person implements Info {
    public String name;

    public Person(String name){
        this.name=name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name of this person is "+this.name);
    }

}
