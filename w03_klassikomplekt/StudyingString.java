package w03_klassikomplekt;


//You always need to create a new string to catch the result of transformation, as string are not changable

public class StudyingString {
    public static void main(String[] args) {
        String str1 = new String("JAva");
        String str2 = "Java";

        System.out.println(str1.charAt(2)); //gives out letter under this index

        str1.codePointAt(2); //gives back symbol under this index in UNICLO coding aka "64"
        str1.compareTo(str2); //Compares strings by their letters in math. If they are same you will get 0;
        str1.compareToIgnoreCase(str2); //as above,but ignores uppercase. Here you would get 0
        str1.concat(str2);//glues together 2 strings aka str1+str2
        str1.equals(str2); //returns boolean, also possible optionwith ignoring case
        str1.hashCode(); //returns objects hashcode aka 385348 or similar

        String[] nameofmas = str1.split(" "); //splits given string into 2 if it has an empty space and retturns a massive
        for(String element : nameofmas){
            System.out.println(element);
        }

        str1.substring(1, 3); //prints out a string that strats from 1st index and ends with last aka "ava"
        tolowercase()
        touppercae();

        String.valueOf(65);//changes int to string. Actually there are many different types to change to string
        String.copyValueOf(data); //Changes massive[] data into a string

SUBSTRING:
        String subOfStrin = str1.substring(0, 2);// gives me a new string with start at 1st index and end at last index +1 so to get full "Java" it is (0,4), normaly (0,3)
        String subOfStrin = str1.substring(0,1);//only gives J
        String subOfStrin = str1.substring(1);//gives everything starting from this index to the end
    
STRINGBUILDER
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend"); etc //this way you add items to string without creating extra weight


    
    }

    
}


There is a default class Object. That has all of those methodes that are build in. Every folowing class gets everything from object class.
So method .toString() is something that works default fro example when we call out system.out.print(str2); It will print out hash code.
But what we can do is to make a method inside out own class like 
public String toString() 
{ 
    return name+","+age;
}
and give the existing method new default meaning within our class. So whenever I would ask to print out new person in class HUMAN
it will give me his name and age by default.