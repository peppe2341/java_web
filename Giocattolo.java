import java.util.ArrayList;
import java.util.List;

class Giocattolo {
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(int id, String nome, double prezzo, int etaConsigliata) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }
}