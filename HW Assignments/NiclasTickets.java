import java.util.Scanner;

public class NiclasTickets {
    public static void main(String[] args) {
        final double COST_R = 225.25f, COST_M = 177.75f, COST_J = 145.50f;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Australian Open!\n");
        System.out.println("Choose an arena:\n");

        System.out.println("[R]od Laver:\t\t$225.25");
        System.out.println("[M]argaret Court:\t$177.75");
        System.out.println("[J]ohn Cain:\t\t$145.50\n");

        System.out.print("Enter R, M or J: ");
        char ans = input.nextLine().charAt(0);
        
        System.out.print("Enter number of tickets: ");
        int nTickets = input.nextInt();

        double totalCost = 0;
        if (ans == 'R') {
            totalCost = nTickets * COST_R;  
        } else if (ans == 'M') {
            totalCost = nTickets * COST_M;
        } else if (ans == 'J') {
            totalCost = nTickets * COST_J;
        } else {
            System.out.println("\nInvalid input");
            return;
        }

        System.out.println("\nThe day will cost: $" + totalCost);
    }
}