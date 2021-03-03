package w03_klassikomplekt;

//extra homework to teach myself Java


public class ClassAndObject {
    public static void main(String[] args) {

        Person boy = new Person();
        boy.setName("Fredrik"); 
        boy.setAge(30);
        boy.sayHello();
        System.out.println("His age is " + boy.getAge());
        int byear = boy.retirement(); //catching the return information into a variable
        System.out.println("Boy years to retirement are "+ byear );
        

        Person girl = new Person();
        girl.setAge(24);
        girl.setName("Margarita");
     // System.out.println(girl.getName()); for some reason works with age and not name
        girl.speak();
        int gyear = girl.retirement();
        System.out.println("Girl years to retirement are "+ gyear );

        Person unknownsex = new Person("Alex",25);
        unknownsex.sayHello();
    }


}

class Person{

    // just variables that are now safe from the general user
    private String name;
    private int age;

    // constructors
    public Person(){   //default constructor
        this.name = "Default name";
        this.age = 0;
        System.out.println("Default constructor was used and the dafaults name and age are "+name +" "+age);
    }

    public Person(String name, int age){

        this.name = name;
        this.age = age;
        System.out.println("Second constructor was used and not default name and age were set");
    }



    // setters and getters instead of using person.name, since now it is safer
    public void setName(String userName){
        if (userName.isEmpty() ){
            System.out.println("Name is empty, not good");
        } else { 
        name = userName;
        }
    }

    //This is the other option to have everywhere the same name. "This" referes to the variable OUTSIDE 
    // of method/function and goes to the one in the main. This is the correct way of doing.
    //   public void setName(String name){
    //     this.name = name;}







    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if(userAge < 0 ||  userAge>100){
            System.out.println("need to have a positive number and smaller than a hundred");
        } else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;

    }


    // just methods
    
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
