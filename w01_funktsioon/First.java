import java.util.Scanner;


// this is class work or random attempts
public class First {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first,second;
        System.out.print("Enter you first number: ");
        first = num.nextInt();
        System.out.print("Enter you second number: ");
        second = num.nextInt();


        if(first>=second){
            System.out.print("Fist Num is bigger or qual to second number");
            System.out.print("\n");
        } else {
            System.out.print("Second Num is bigger than first number");

        }
    }
}
///// 