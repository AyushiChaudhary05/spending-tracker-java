import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Spending Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Spending");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Date: ");
                String date = sc.nextLine();

                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                System.out.print("Enter Description: ");
                String desc = sc.nextLine();

                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();

                Expense exp = new Expense(date, category, desc, amount);
                manager.addExpense(exp);

            } else if (choice == 2) {
                manager.showExpenses();

            } else if (choice == 3) {
                manager.showTotal();

            } else if (choice == 4) {
                System.out.println("Thank you for using Spending Tracker!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}

