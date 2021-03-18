package w06_liides.OwnIdeaHomework;

public class Main {
    public static void main(String[] args) {
        

        Human girl1 = new Girl("Wendy","blue");
        Human boy1 = new Boy("Alex","blue");

        girl1.canIntroduce();
        boy1.canIntroduce();
        girl1.hasOpinion();
        boy1.hasOpinion();

    }
}
