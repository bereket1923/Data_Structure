package Assignment.Ass2;

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<LibraryRecord> records = new ArrayList<>();

        // 2. Add multiple records
        records.add(new LibraryRecord("Data Structures", null, 0, false));
        records.add(new LibraryRecord("Java Programming", "Alice", 5, true));
        records.add(new LibraryRecord("Algorithms Unlocked", "Bob", 3, true));
        records.add(new LibraryRecord("Clean Code", null, 0, false));

        // 3. Remove one record
        records.remove(0);

        // 4. Modify an existing record using set()
        records.set(2, new LibraryRecord("jump", "Alice", 5, true));

        // 5. Display total number of records
        System.out.println("Total Records: " + records.size());

        // 6. Retrieve and display a specific record
        System.out.println("\nRecord at index 1:");
        System.out.println(records.get(1));

        // Logic and Processing
        int totalBorrowDays = 0;

        for (LibraryRecord rec : records) {
            if (rec.isBorrowed()) {
                totalBorrowDays += rec.getBorrowDays();
            }
        }

        System.out.println("Total Borrow Days (Borrowed Books): " + totalBorrowDays);

        // Clear all records
        records.clear();
        System.out.println("Records after clear: " + records.size());
    }
}
