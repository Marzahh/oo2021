package w06_liides.OwnIdeaHomework;

public class Girl implements Human{

    public String color;
    public String name;
    public String ColourOfChoice;

    public Girl(String name,String color){
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
            System.out.println("Wendy: I hate color blue!");

        } else {
            System.out.println("Wendy:I love warm colours!");
        }
        
    }

    
}
