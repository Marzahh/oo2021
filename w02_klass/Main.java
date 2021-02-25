public class Main {
    public static void main(String[] args) {

        GameCharacter ahri = new GameCharacter();
        System.out.println("Ahris default damage is " + Ahri.damage);

        Ahri.damage = 120;
        System.out.println("Ahris NEW damage is " + Ahri.damage);
        System.out.println("");

        
        Ahri.say("Ahri");
        
    }
}
