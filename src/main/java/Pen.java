public abstract class Pen {
    String brand;
    String name;
    int Price;
    PenType type;
    CloseType closeType;

    public abstract void Write();

    public abstract void open();

    public  abstract void close();

    @Override
    public String toString() {
        return "Pen{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                ", type=" + type +
                ", closeType=" + closeType +
                '}';
    }
}
