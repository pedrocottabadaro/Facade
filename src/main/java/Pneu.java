public class Pneu extends Mecanico{
    private static Pneu pneu = new Pneu();
    private Pneu(){};
    public static Pneu getInstance(){return pneu;};
}
