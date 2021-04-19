package task2;

public class Deal {
    double width;
    double length;
    double price;

    public Deal(int width, int length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }
}
