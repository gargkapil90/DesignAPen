public class GelPen extends Pen implements Refilable{

    Refill refill;
    public GelPen() {
        this.type = PenType.GEL;
    }

    @Override
    public void Write() {
        System.out.println("Writing via gel pen");
    }

    @Override
    public void open() {
        System.out.println("Opening a gel pen");
    }

    @Override
    public void close() {
        System.out.println("Closing a gel pen");
    }

    @Override
    public void refill() {
        System.out.println("Refill a gel pen");
    }
}
