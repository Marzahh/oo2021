import java.util.Scanner;

///this is my homework for the first class
public class Second {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first%second;
        
        System.out.println("The remainder of the number is " + result);
    }
}
