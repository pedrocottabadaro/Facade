import java.util.ArrayList;
import java.util.List;

public abstract class Mecanico {
    private List<Carro> carrosNoConserto = new ArrayList<>();
    public void addCarroConserto(Carro carro){this.carrosNoConserto.add(carro);};
    public boolean verificarCarroConserto(Carro carro){
        return this.carrosNoConserto.contains(carro);
    }
}
