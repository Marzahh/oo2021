package w05_kontrolltoo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Trying {
    public static void main(String[] args) {
        Scanner scan = null;
        try {


            //SCANNING FILE AND CREATING AN ARRAYLIST
            scan = new Scanner(new File("\\Users\\marga\\Desktop\\objekt program\\oo2021\\w05_kontrolltoo1\\textHere.txt")).useDelimiter("[.,:;()?!\"\\s]+");
            
            int aCount = 0;
            int letterCount =0;
            String token1 = "";
            int wordWithAtLeastOneA = 0;
            int wordWithA = 0;
            int word1A = 0;
            int word2A = 0;
            int word3A = 0;
            int word4OrMoreA = 0;
            int percentOfAWords = 0;

            ArrayList<String> text = new ArrayList<String>();


            // SCANNING EVERY WORD INTO AN ARRAY LIST
            while(scan.hasNext()){
                token1 = scan.next();
                text.add(token1);
            }
            System.out.println("Amount of words in the scanned list is : " + text.size());

            //COUNTING HOW MANY LETTERS 'A' TEXT HAS
            for(String element : text){
                for (int i=0;i<=element.length()-1;i++){
                    if (element.charAt(i) == 'A' || element.charAt(i) == 'a') {
                        aCount++; 
                    } 
                }           
            }
            System.out.println("There are "+aCount+" letters 'A'. "); 
            System.out.println();
            
            //HOW MANY LETTERS IN TOTAL TEXT HAS
            for(String element : text){
                for (int i=0;i<=element.length()-1;i++){
                    letterCount++;    
                }       
            }

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
            //System.out.println("There were "+ word1A+ " words, that had one letter 'A' in them." );
            System.out.println("There were "+ word2A+ " words, that had two letters 'A' in them." );
            System.out.println("There were "+ word3A+ " words, that had three letters 'A' in them." );
            System.out.println("There were "+ word4OrMoreA+ " words, that had 4 or more letters 'A' in them." );


           //COUNTING HOW MANY LETTERS THERE ARE IN TOTAL, COMPARE TO NUMBER OF "A" LETTERS
            
            int percentOfA = aCount*100/letterCount;
            System.out.println();
            System.out.println("The entire number of letters is "+ letterCount+" and letter 'A' makes " + percentOfA+ "% out of them or " +aCount+ " letters.");


           // HOW MANY WORDS OUT OF TOTAL WORDS HAVE LETTER A IN THEM
            percentOfAWords = wordWithAtLeastOneA*100/text.size();
            System.out.println("Words with letter 'A' make "+ percentOfAWords+ "% out of all words in the text.");
    
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        finally{
            scan.close();
        }
    
    }
}
