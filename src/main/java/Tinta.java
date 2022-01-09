public class Tinta extends Mecanico{
    private static Tinta tinta = new Tinta();
    private Tinta(){};
    public static Tinta getInstance(){return tinta;};
}
