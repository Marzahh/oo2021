package w03_klassikomplekt;

public class ClassAndObject {
    public static void main(String[] args) {
        Person boy = new Person();
        boy.name = "Fredrik";
        boy.age = 30;
        boy.sayHello();
        int byear = boy.retirement();
        System.out.println("Boy years to retirement are "+ byear );
        

        Person girl = new Person();
        girl.age = 24;
        girl.name = "Margarita";
        girl.speak();
        int gyear = girl.retirement();
        System.out.println("Girl years to retirement are "+ gyear );

        
    }


}

class Person{
    String name;
    int age;

    int retirement(){

        int years = 65 - age;
        return years;
    }

    void speak(){
        for(int i=0; i<3; i++){

        System.out.println("My name is " + name + " and I´m that old = "+ age);
        }
    }

    void sayHello(){

        System.out.println("Hello from " + name);
    }


}
