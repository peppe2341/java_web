import java.util.ArrayList;
import java.util.List;

public class RegistroVenditeConcreto extends RegistroVendite {
    private List<Vendita> vendite;

    public RegistroVenditeConcreto() {
        this.vendite = new ArrayList<>();
    }

    @Override
    public void registraVendita(int id, Cliente cliente, Giocattolo giocattolo) {
        Vendita vendita = new Vendita(id, cliente, giocattolo);
        vendite.add(vendita);
    }

    @Override
    public List<Vendita> getVendite() {
        return vendite;
    }
}
