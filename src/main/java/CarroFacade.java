public class CarroFacade {
    public static boolean verificarPendenciasConserto(Carro carro) {
        if (Motor.getInstance().verificarCarroConserto(carro)) {
            return false;
        }
        if (Pneu.getInstance().verificarCarroConserto(carro)) {
            return false;
        }
        if (Tinta.getInstance().verificarCarroConserto(carro)) {
            return false;
        }
        if (Vidro.getInstance().verificarCarroConserto(carro)) {
            return false;
        }
        return true;
    }
}
