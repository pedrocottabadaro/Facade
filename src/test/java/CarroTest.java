
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CarroTest {

    @Test
    void deveRetornarProblemaMotor() {
        Carro carro = new Carro();
        Motor.getInstance().addCarroConserto(carro);

        assertEquals(false, carro.consertar());
    }

    @Test
    void deveRetornarProblemaPneu() {
        Carro carro = new Carro();
        Pneu.getInstance().addCarroConserto(carro);

        assertEquals(false, carro.consertar());
    }

    @Test
    void deveRetornarProblemaTinta() {
        Carro carro = new Carro();
        Tinta.getInstance().addCarroConserto(carro);

        assertEquals(false, carro.consertar());
    }

    @Test
    void deveRetornarProblemaVidro() {
        Carro carro = new Carro();
        Vidro.getInstance().addCarroConserto(carro);

        assertEquals(false, carro.consertar());
    }

    @Test
    void deveRetornarcarroSemProblemas() {
        Carro carro = new Carro();

        assertEquals(true, carro.consertar());
    }
}