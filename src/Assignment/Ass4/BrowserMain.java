package Assignment.Ass4;

/**
 * BrowserMain simulates browser history operations.
 * Demonstrates visiting pages, navigation, forward/backward history,
 * clearing history, frequent page tracking, and error handling.
 */
public class BrowserMain {

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        System.out.println("=== Browser History Management System ===\n");

        // ------------- Scenario 1: Visit Pages -------------
        System.out.println("--- Scenario 1: Visit Pages ---");
        history.visitPage("https://google.com");
        sleep(50); // small delay to differentiate timestamps
        history.visitPage("https://youtube.com");
        sleep(50);
        history.visitPage("https://stackoverflow.com");
        sleep(50);
        history.visitPage("https://github.com");
        showHistory(history);

        // ------------- Scenario 2: Go Back and Visit New Page -------------
        System.out.println("\n--- Scenario 2: Go Back and Visit New Page ---");
        System.out.println("Going back 2 steps...");
        history.goBack(2);
        showHistory(history);

        System.out.println("Can go back? " + history.canGoBack());
        System.out.println("Can go forward? " + history.canGoForward());

        System.out.println("\nVisiting Amazon (forward history will be deleted):");
        history.visitPage("https://amazon.com");
        showHistory(history);
        System.out.println("Can go forward? " + history.canGoForward());

        // ------------- Scenario 3: Navigation -------------
        System.out.println("\n--- Scenario 3: Navigation ---");
        history.visitPage("https://reddit.com");
        history.visitPage("https://twitter.com");
        showHistory(history);

        System.out.println("\nGoing back 3 steps...");
        history.goBack(3);
        showHistory(history);

        System.out.println("\nGoing forward 2 steps...");
        history.goForward(2);
        showHistory(history);

        System.out.println("\nTrying to go back 10 steps (exceeds available history):");
        history.goBack(10);
        showHistory(history);

        // ------------- Scenario 4: Find Frequent Page -------------
        System.out.println("\n--- Scenario 4: Find Frequent Page ---");
        history.visitPage("https://google.com");
        sleep(50);
        history.visitPage("https://youtube.com");
        sleep(50);
        history.visitPage("https://google.com");
        showHistory(history);

        System.out.println("Most Frequent Page: " + history.findFrequentPage());

        // ------------- Scenario 5: Test Utility Methods -------------
        System.out.println("\n--- Scenario 5: Utility Methods ---");
        System.out.println("Current page: " + history.getCurrentPage());
        System.out.println("History size: " + history.size());
        System.out.println("Is history empty? " + history.isEmpty());
        System.out.println("Can go back? " + history.canGoBack());
        System.out.println("Can go forward? " + history.canGoForward());

        // ------------- Scenario 6: Clear History -------------
        System.out.println("\n--- Scenario 6: Clear History ---");
        history.clearHistory();
        showHistory(history);
        System.out.println("Is history empty? " + history.isEmpty());
        System.out.println("History size: " + history.size());

        System.out.println("\nVisiting pages after clear:");
        history.visitPage("https://netflix.com");
        history.visitPage("https://spotify.com");
        showHistory(history);

        // ------------- Scenario 7: Error Handling -------------
        System.out.println("\n--- Scenario 7: Error Handling ---");
        try {
            System.out.println("Trying to go back with negative steps...");
            history.goBack(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Trying to visit null URL...");
            history.visitPage(null);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Caught exception: " + e.getMessage());
        }

        try {
            System.out.println("Trying to visit empty URL...");
            history.visitPage("");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Caught exception: " + e.getMessage());
        }

        System.out.println("\n=== Program Complete ===");
    }

    /**
     * Helper: Pause execution for a short time to ensure unique timestamps
     * between page visits.
     * Handles InterruptedException safely.
     */
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms); // pause current thread
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // preserve interrupted status
        }
    }

    /**
     * Helper: Display history with the current page highlighted.
     * Makes it easier to visualize history state at each step.
     */
    private static void showHistory(BrowserHistory history) {
        System.out.print("History: ");
        history.displayHistory();
        System.out.println("Current page: " + history.getCurrentPage());
    }
}
