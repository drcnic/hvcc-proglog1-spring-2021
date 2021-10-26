// Notes: 
//  arr[n]: n is a 'subscript', not index
//  array bounds checking occurs at runtime
//  array.length is a member, not a method
//  arrays are passed by reference, same as classes

import java.io.*;
import java.util.Scanner;

public class NiclasBBArray {
    public static void main(String args[]) throws IOException {
        File file = new File("bbInput.txt");
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }
        Scanner input = new Scanner(file);

        String name  = input.nextLine();
        int fYear    = input.nextInt();
        int numYears = input.nextInt();
        double fgRates[] = new double[numYears];

        for (int i = 0; i < numYears; i++) {
            fgRates[i] = 1.f/(input.nextInt()/(double)input.nextInt()); 
        }

        printFGP(name, fYear, fgRates);

        input.close();
    }

    public static void printFGP(String name, int fYear, double arr[]) {
        System.out.println(name + "'s Field Goal Percentage By Year:\n");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Year: %d\t Field Goal Percentage: %.1f%%\n", fYear+i, arr[i]*100);
        }
    }
}