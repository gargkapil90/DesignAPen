public class FountainPen extends Pen{

    Nib nib;
    Ink ink;

    @Override
    public void Write() {
        System.out.println("Writing via fountain pen");
    }

    @Override
    public void open() {
        System.out.println("Opening a fountain pen");
    }

    @Override
    public void close() {
        System.out.println("Closing a fountain pen");
    }
}
