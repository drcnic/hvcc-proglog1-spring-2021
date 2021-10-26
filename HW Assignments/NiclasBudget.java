import java.util.Scanner;

public class NiclasBudget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount budgeted for the month: ");
        int monthlyBudget = input.nextInt();
        
        int sentinel = 0, expenses = 0;
        int loops = -1;
        while(sentinel != -1) {
            System.out.print("Enter the expense (-1 to quit): ");
            expenses += sentinel;
            sentinel = input.nextInt();
            loops++;
        }

        System.out.println("\n$" + monthlyBudget + " budgeted.");
        System.out.printf("%d expenses totaling $%d.\n", loops, expenses);
        
        int diff = monthlyBudget - expenses;

        if (diff > 0) {
            System.out.printf("$%d under budget.\n", diff);
        } else if (diff < 0) {
            System.out.printf("$%d over budget.\n", -diff);
        } else {
            System.out.println("Expenses equals amount budgeted.");
        }
    }
}