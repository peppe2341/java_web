class Vendita {
    private int id;
    private Cliente cliente;
    private Giocattolo giocattolo;

    public Vendita(int id, Cliente cliente, Giocattolo giocattolo) {
        this.id = id;
        this.cliente = cliente;
        this.giocattolo = giocattolo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Giocattolo getGiocattolo() {
        return giocattolo;
    }
}
