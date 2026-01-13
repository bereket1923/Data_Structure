package Week1.inheritance;

public class computer {
    public String manufacturer;
    public String processor;
    public int ram;
    public int storage;
    public int price;

    public computer(String manufacturer, String processor, int ram, int storage, int price) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
