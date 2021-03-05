package w05_kontrolltoo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trying {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            File file = new File("\\Users\\marga\\Desktop\\objekt program\\oo2021\\w05_kontrolltoo1\\textHere.txt");
            scan = new Scanner(file);
            int Acount = 0;
            while(scan.hasNext()){
                String line = scan.nextLine();
                int lenght = line.length();
                for(int i = 0 ; i < lenght; i++){
                    if(line.charAt(i) == 'A'  ||  line.charAt(i) == 'a'){
                        Acount ++;
                    }
                }
            }
            System.out.println("The number of 'A' letters (big or small) is : "+Acount);
    
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        finally{
            scan.close();
        }
    
    }
}
