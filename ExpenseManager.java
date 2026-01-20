import java.util.ArrayList;

public class ExpenseManager {

    ArrayList<Expense> expenses = new ArrayList<>();

    void addExpense(Expense e) {
        expenses.add(e);
        System.out.println("Expense added successfully!");
    }

    void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense e : expenses) {
            System.out.println(
                e.date + " | " + e.category + " | " + e.description + " | Rs." + e.amount
            );
        }
    }

    void showTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }
        System.out.println("Total Spending: Rs." + total);
    }
}
