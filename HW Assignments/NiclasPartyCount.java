import java.util.Scanner;
import java.io.*;
//import java.util.Random;

public class NiclasPartyCount {
    public static void main(String[] args) throws IOException {
        /*
        // write text to files using PrintWriter class from java.io.*
        PrintWriter outputFile = new PrintWriter(FILENAME); // destroys original text file
        
        FileWriter  fwriter    = new FileWriter(FILENAME, true);    
        PrintWriter outputFile = new PrintWriter(fwriter);  // preserves original data and appends

        outputFile.println()    // add a line to file
        outputFile.close;   // no longer using file

        // reading from a file
        File myFile = new File(FILENAME);
        myFile.exists();    // bool check for existence
        Scanner readFile = new Scanner(myFile);

        // when file is opened for reading, read position is maintained as the next item to be read
        
        readFile.close(); // no longer using file, close istream from scanner

        // scanner method .hasNext() can be used in loops
        // .nextLine() method reads a string
        */

        final String FILENAME = "partyResponses.txt";
        File partyFile = new File(FILENAME);
        
        if (!partyFile.exists()) {
            System.out.println("File \"" + FILENAME + "\" does not exist.");
            return;
        }

        Scanner inputFile = new Scanner(partyFile);

        int aye, naw;
        aye = naw = 0;
        while (inputFile.hasNext()) {
            String tok = inputFile.next();
            if (tok.equals("aye")) {
                aye++;
            }
            if (tok.equals("naw")) {
                naw++;
            }
        }

        System.out.println(aye + " people will attend.");
        System.out.println(naw + " people aren't attending.");
        
        inputFile.close();
    }
}