//
//  NOTES
//
//  @param parameterName Description
//  
//  - non-primitive types are passed by reference, not by value; ex. of non-prim. type: String
//  - String objects are immutable in java 
//
//  WHEN PASSING ARGS TO METHOD:
//  widening conversion: changes a value to a data type that can allow for any possible value of the original data; 
//                      preserves source value but changes how it's represented; java does this automatically; ex: int to float
//  narrowing conversion: changes a value to a data type that might not be able to hold some of the possible values; 
//                        java will NOT do this automatically; ex: truncation
//
import java.util.Scanner;

public class NiclasSpaceAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in Earth years: ");
        int earthAge = input.nextInt();
        
        mercuryAge(earthAge);
        venusAge(earthAge);
        marsAge(earthAge);
        jupiterAge(earthAge);
        saturnAge(earthAge);
        uranusAge(earthAge);
        neptuneAge(earthAge);
        plutoAge(earthAge);
    }

    public static void mercuryAge(float earthAge) {
        // op: 88 days
        System.out.printf("You are %.2f Mercurian years old.\n", earthAge/(88.0f/365.25f));
    }

    public static void venusAge(float earthAge) {
        // op: 224.7 days
        System.out.printf("You are %.2f Venusian years old.\n", earthAge/(224.7f/365.25f));
    }

    public static void marsAge(float earthAge) {
        // op: 687 days
        System.out.printf("You are %.2f Martian years old.\n", earthAge/(687.0f/365.25f));
    }
    
    public static void jupiterAge(float earthAge) {
        // op: 11.86 years
        System.out.printf("You are %.2f Jovian years old.\n", earthAge/11.86f);
    }

    public static void saturnAge(float earthAge) {
        // op: 29.46 years
        System.out.printf("You are %.2f Saturnian years old.\n", earthAge/29.46f);
    }

    public static void uranusAge(float earthAge) {
        // op: 84 years
        System.out.printf("You are %.2f Uranian years old.\n", earthAge/84.0f);
    }
    
    public static void neptuneAge(float earthAge) {
        // op: 164.8 years
        System.out.printf("You are %.2f Neptunian years old.\n", earthAge/164.8f);
    }
    
    public static void plutoAge(float earthAge) {
        // op: 248 years
        System.out.printf("You are %.2f Plutonian years old.\n", earthAge/248.f);
    }
}