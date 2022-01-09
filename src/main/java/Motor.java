public class Motor extends Mecanico{
    private static Motor motor = new Motor();
    private Motor(){};
    public static Motor getInstance(){return motor;};
}
