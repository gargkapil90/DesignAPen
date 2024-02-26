public class Ballpen extends Pen implements Refilable{

    Refill refill;

    public Ballpen() {
        super();
        this.type = PenType.BALL;
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void Write() {
        System.out.println("writing from ball pen");
    }

    @Override
    public void open() {
        System.out.println("opening a ball pen");
    }

    @Override
    public void close() {
        System.out.println("Closing a ball pen");
    }

    @Override
    public void refill() {
        System.out.println("Refill a ball pen");
    }
}
