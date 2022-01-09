public class Vidro extends Mecanico{
    private static Vidro vidro = new Vidro();
    private Vidro(){};
    public static Vidro getInstance(){return vidro;};
}
