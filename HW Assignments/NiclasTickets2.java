import java.util.Scanner;

public class NiclasTickets {
    public static void main(String[] args) {
        final double COST_R = 225.25f, COST_M = 177.75f, COST_J = 145.50f;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Australian Open!\n");
        System.out.println("Choose an arena:\n");

        System.out.printf("[R]od Laver:\t\t$%.2f\n", COST_R);
        System.out.printf("[M]argaret Court:\t$%.2f\n", COST_M);
        System.out.printf("[J]ohn Cain:\t\t$%.2f\n\n", COST_J);

        System.out.print("Enter R, M or J: ");
        char ans = input.nextLine().charAt(0);
        
        System.out.print("Enter number of tickets: ");
        int nTickets = input.nextInt();

        double totalCost = 0;
        
        switch(ans) {
            case 'R':
                totalCost = nTickets * COST_R;
                break;
            case 'M':
                totalCost = nTickets * COST_M;
                break;
            case 'J':
                totalCost = nTickets * COST_J;
                break;
            default:
                System.out.println("\nInvalid input");
                return;
        }

        System.out.printf("\nThe day will cost: $%.2f\n", totalCost);
    }
}