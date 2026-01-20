package Assignment.Ass5;
import java.util.ListIterator;
public class DoubleLinkedMain {

    /**
     * Tests doubly linked list operations and iterators
     */
  static void main(String[] args) {

        DoublyLinkedIterator<Integer> list = new DoublyLinkedIterator<>();

        System.out.println("=== TESTING addFirst & addLast ===");
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.displayForward();     // 10 20 30 40
        list.displayBackward();    // 40 30 20 10

        System.out.println("\n=== TESTING add(index) ===");
        list.add(0, 5);            // at head
        list.add(2, 15);           // middle
        list.add(list.size() - 1, 35); // before last
        list.displayForward();     // 5 10 15 20 30 35 40
        list.displayBackward();

        System.out.println("\n=== TESTING get(index) ===");
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Element at last index: " + list.get(list.size() - 1));

        System.out.println("\n=== TESTING set(index, value) ===");
        list.set(0, 100);
        list.set(3, 200);
        list.displayForward();     // 100 10 15 200 30 35 40

        System.out.println("\n=== TESTING removeFirst & removeLast ===");
        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());
        list.displayForward();

        System.out.println("\n=== TESTING remove(index) ===");
        System.out.println("Removed index 2: " + list.remove(2));
        list.displayForward();

        System.out.println("\n=== TESTING ITERATOR (forward) ===");
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\n=== TESTING ITERATOR (backward) ===");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        System.out.println("\n\n=== TESTING ITERATOR add(), set(), remove() ===");
        it = list.listIterator();

        System.out.println("Adding 999 at beginning using iterator.add()");
        it.add(999);
        list.displayForward();

        System.out.println("Moving forward twice...");
        it.next();
        it.next();

        System.out.println("Setting current element to 555 using iterator.set()");
        it.set(555);
        list.displayForward();

        System.out.println("Removing current element using iterator.remove()");
        it.remove();
        list.displayForward();

        System.out.println("\n=== FINAL LIST STATE ===");
        list.displayForward();
        list.displayBackward();
    }
}