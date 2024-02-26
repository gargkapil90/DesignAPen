public class Client {
    public static void main(String[] args) {
        Pen pen = new Ballpen();
        pen.brand = "Rotomac";
        pen.name = "metro";
        pen.closeType = CloseType.CAP;
        pen.Price = 10;
        System.out.println(pen);

    }
}
