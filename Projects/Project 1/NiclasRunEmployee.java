import java.util.Scanner;
import java.io.*;

public class NiclasRunEmployee {
    public static void main(String[] args) throws IOException {
        final String FILENAME = "employeeInput.txt";
        File employeeFile = new File(FILENAME);
        
        if (!employeeFile.exists()) {
            System.out.println("File \"" + FILENAME + "\" does not exist.");
            return;
        }

        Scanner inputFile = new Scanner(employeeFile);
        System.out.println(inputFile.nextLine());
        
        while(inputFile.hasNext()) {
            makeLine(50);
            
            String  id          = inputFile.next();
            String  firstName   = inputFile.next();
            String  lastName    = inputFile.next();
            char    chLevel     = inputFile.next().charAt(0);
            double  salary      = inputFile.nextDouble();

            String level = "";
            switch(chLevel) {
                case 'A':
                    level = "Executive";
                    break;
                case 'B':
                    level = "Associate";
                    break;
                case 'C':
                    level = "Assistant";
                    break;
                case 'D':
                    level = "Intern";
                default:
            }

            System.out.printf("Employee:\t%s %s\n", firstName, lastName);
            System.out.printf("Position:\t%s\n", level);
            System.out.printf("Salary:\t\t$%,.2f\n", salary);
            System.out.printf("Email Address:\t%s@hv.com\n", (firstName.charAt(0) + "-" + lastName).toLowerCase());
        }

        inputFile.close();
    }

    public static void makeLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
