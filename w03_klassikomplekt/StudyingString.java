package w03_klassikomplekt;

public class StudyingString {
    public static void main(String[] args) {
        String str1 = new String("JAva");
        String str2 = "Java";

        System.out.println(str1.charAt(2)); //gives out letter under this index
        str1.codePointAt(2); //gives back symbol under this index in UNICLO coding aka "64"
        str1.compareTo(str2); //Compares strings by their letters in math. If they are same you will get 0;
        str1.compareToIgnoreCase(str2); //as above,but ignores uppercase. Here you would get 0
        str1.concat(str2);//glues together 2 strings aka str1+str2



    }

    
}