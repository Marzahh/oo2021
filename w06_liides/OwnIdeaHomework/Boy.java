package w06_liides.OwnIdeaHomework;

public class Boy implements Human{

    public String color;
    public String name;
    public String ColourOfChoice;

    public Boy(String name,String color){
        this.color = ColourOfChoice;
        this.name=name;
    }



    @Override
    public void canIntroduce() {
        System.out.println("Hey there, my name is "+name);
    }

    @Override
    public void hasOpinion() {
        if (ColourOfChoice == "blue"){
            System.out.println("Alex: I love color blue!");

        } else {
            System.out.println("Alex:I love cold colours!");
        }
        
    }

    
}
