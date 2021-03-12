package w05_kontrolltoo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class PlaceForErrors {
    public static void main(String[] args) {
        Scanner scan = null;
        try {


            //SCANNING FILE AND CREATING ARRAYLIST
            scan = new Scanner(new File("\\Users\\marga\\Desktop\\objekt program\\oo2021\\w05_kontrolltoo1\\textHere.txt")).useDelimiter("[.,:;()?!\"\\s]+");
            
            int aCount = 0;
            int elseCountSmall =0;
            int elseCountBig = 0;
            String token1 = "";
            int wordWithAtLeastOneA = 0;
            int wordWithA = 0;
            int word1A = 0;
            int word2A = 0;
            int word3A = 0;
            int word4OrMoreA = 0;

            ArrayList<String> text = new ArrayList<String>();

            
  /*          //COUNTING HOW MANY A-LETTERS

            while (scan.hasNext()) {
                String line = scan.nextLine();
                int lenght = line.length();

                

            

                for (int i = 0; i < lenght; i++) {
                    if (line.charAt(i) == 'A' || line.charAt(i) == 'a') {
                        aCount++;
                    } else if (line.charAt(i) >= 'b' && line.charAt(i)<= 'z'){
                        elseCountSmall++;
                    } else if (line.charAt(i) >= 'B' && line.charAt(i)<= 'Z'){
                        elseCountBig++;
                    };
                }
            }
            System.out.println("The number of 'A' letters (big or small) is : " + aCount);
*/
            

            // SCANNING EVERY WORD INTO AN ARRAY LIST
            while(scan.hasNext()){
                token1 = scan.next();
                text.add(token1);
            }
            System.out.println("Amount of words in the scanned list is : " + text.size());


            //COUNTING HOW MANY WORDS HAVE 'A' LETTER IN THEM
            for(String element : text){
                for (int i=0;i<=element.length()-1;i++){
                    if (element.charAt(i) == 'A' || element.charAt(i) == 'a') {
                        wordWithAtLeastOneA++;;
                        break; 
                    } 
                }           
            }
            System.out.println("There are "+wordWithAtLeastOneA+" words that have at least one letter 'A' in them.");


            //COUNTING NUMBER OF WORDS THAT HAVE 1/2/3 or more 'A' LETTER IN THEM
            for(String element : text){
            wordWithA = 0;
                for (int i=0;i<=element.length()-1;i++){
                    if (element.charAt(i) == 'A' || element.charAt(i) == 'a') {
                        wordWithA++;
            if(wordWithA == 1){
                word1A++;
            }else if (wordWithA == 2){
                word2A++;
            }else if (wordWithA == 3){
                word3A++;
            }else if (wordWithA >= 4){
                word4OrMoreA++;
            } 
                    } 
                }             
            }
            System.out.println("There were "+ word1A+ " words, that had one letter 'A' in them." );
            System.out.println("There were "+ word2A+ " words, that had two letters 'A' in them." );
            System.out.println("There were "+ word3A+ " words, that had three letters 'A' in them." );
            System.out.println("There were "+ word4OrMoreA+ " words, that had 4 or more letters 'A' in them." );


           //COUNTING HOW MANY LETTERS THERE ARE IN TOTAL, COMPARE TO NUMBER OF "A" LETTERS
            
            int allLetters =  elseCountSmall+elseCountBig+aCount;
            int percentOfA = aCount*100/allLetters;
            
            System.out.println("The entire number of letters is  "+ allLetters+" and letter 'A' makes " + percentOfA+ "% out of them or " +aCount+ "letters.");

          //  for(String element : textArray){
          //      System.out.println(element);
          //  }
    
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        finally{
            scan.close();
        }
    
    }
}
