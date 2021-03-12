package w05_kontrolltoo1;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        // Just a separate test: same delimiter, with test-input
        //String delimiterRegex = \d;
        String testInput = " Hello, World How are 9 90 9000 you?.";
        // so we create a new scanner
        Scanner testScanner = new Scanner( testInput );
        testScanner.useDelimiter("[.,:;()?!\"\\s]+");
        int tokenCount = 0;
        while( testScanner.hasNext() ) {
            tokenCount++;
            System.out.println("Token " + tokenCount + ": " + testScanner.next() );
        }
        testScanner.close();
    }
}
