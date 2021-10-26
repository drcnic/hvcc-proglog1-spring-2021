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
        
        NiclasEmployee employee;
        NiclasEmployee employees[] = new NiclasEmployee[12];

        int i = 0;
        while(inputFile.hasNext()) { 
            String  id          = inputFile.next();
            String  firstName   = inputFile.next();
            String  lastName    = inputFile.next();
            char    chLevel     = inputFile.next().charAt(0);
            double  salary      = inputFile.nextDouble();
            boolean bonus       = inputFile.nextBoolean();
            
            employee = new NiclasEmployee(id, firstName + " " + lastName, chLevel, salary, bonus);
            employee.setEmail((firstName.charAt(0) + "-" + lastName + "@hv.com").toLowerCase());
            employees[i] = employee;
            i++;
        }

        /*for (NiclasEmployee emp : employee) {
            emp.display();
        }*/

        for (int j = 0; j < employees.length; j++) {
            employees[j].display();
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
