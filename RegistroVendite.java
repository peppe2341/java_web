import java.util.List;

public abstract class RegistroVendite {
    public abstract void registraVendita(int id, Cliente cliente, Giocattolo giocattolo);

    public abstract List<Vendita> getVendite();
}
