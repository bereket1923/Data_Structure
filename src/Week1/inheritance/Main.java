package Week1.inheritance;

public class Main {
    public static void main(String[] args) {
        noteBook n = new noteBook("HP", "Intel", 8, 128, 10000);
        System.out.println(n);
        computer c = new computer("HP", "Intel", 8, 128, 10000);
        System.out.println(c);
    }
}
