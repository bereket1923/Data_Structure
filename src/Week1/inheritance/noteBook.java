package Week1.inheritance;

public class noteBook extends computer{
    private double screenSize;

    public noteBook(String manufacturer, String processor, int ram, int storage, int price) {
        super(manufacturer, processor, ram, storage, price);
        this.screenSize = screenSize;

    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    @Override
    public String toString() {
        return "noteBook{" +
                super.toString() +
                "screenSize=" + screenSize +
                '}';
    }
}
