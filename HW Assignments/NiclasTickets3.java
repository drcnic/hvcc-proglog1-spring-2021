import java.util.Scanner;

public class NiclasTickets3 {
    final static double COST_R = 225.25f, COST_M = 177.75f, COST_J = 145.50f;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayPrices();
        
        char    stadium     = getStadium();
        int     numTickets  = getNumTickets();
        double  totalCost   = calculatePrice(stadium, numTickets);
        
        displayTotal(totalCost);
    }

    public static void displayPrices() {
        System.out.println("Welcome to the Australian Open!\n");
        System.out.println("Choose an arena:\n");
        System.out.printf("[R]od Laver:\t\t$%.2f\n", COST_R);
        System.out.printf("[M]argaret Court:\t$%.2f\n", COST_M);
        System.out.printf("[J]ohn Cain:\t\t$%.2f\n\n", COST_J);
    }

    public static char getStadium() {
        char ans = ' ';

        while(ans != 'R' && ans != 'M' && ans != 'J') {
            System.out.print("Enter R, M or J: ");
            ans = input.nextLine().charAt(0);
        }

        return ans;
    }

    public static int getNumTickets() {   
        int nTickets = 0;

        while(nTickets < 1 || nTickets > 10) {
            System.out.print("Enter number of tickets: ");
            nTickets = input.nextInt();
        }

        return nTickets;
    }

    public static double calculatePrice(char stadium, int numTickets) {
        double totalCost = 0.0;

        switch(stadium) {
            case 'R':
                totalCost = numTickets * COST_R;
                break;
            case 'M':
                totalCost = numTickets * COST_M;
                break;
            case 'J':
                totalCost = numTickets * COST_J;
                break;
            default:
        }

        return totalCost;
    }

    public static void displayTotal(double totalCost) {
        System.out.printf("\nThe day will cost: $%.2f\n", totalCost);
    }
}