public class NegozioGiocattoli {
    private List<Giocattolo> inventario;
    private List<Cliente> clienti;
    private List<Vendita> vendite;

    public NegozioGiocattoli() {
        inventario = new ArrayList<>();
        clienti = new ArrayList<>();
        vendite = new ArrayList<>();
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo) {
        inventario.add(giocattolo);
    }

    public void aggiungiCliente(Cliente cliente) {
        clienti.add(cliente);
    }

    public void registraVendita(int idVendita, int idCliente, int idGiocattolo) {
        Cliente cliente = trovaCliente(idCliente);
        Giocattolo giocattolo = trovaGiocattolo(idGiocattolo);

        if (cliente != null && giocattolo != null) {
            Vendita vendita = new Vendita(idVendita, cliente, giocattolo);
            vendite.add(vendita);
        } else {
            System.out.println("Cliente o giocattolo non trovato.");
        }
    }

    public Cliente trovaCliente(int id) {
        for (Cliente cliente : clienti) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Giocattolo trovaGiocattolo(int id) {
        for (Giocattolo giocattolo : inventario) {
            if (giocattolo.getId() == id) {
                return giocattolo;
            }
        }
        return null;
    }

    public void mostraInventario() {
        System.out.println("Inventario:");
        for (Giocattolo giocattolo : inventario) {
            System.out.println("ID: " + giocattolo.getId() +
                    ", Nome: " + giocattolo.getNome() +
                    ", Prezzo: " + giocattolo.getPrezzo() +
                    ", Età consigliata: " + giocattolo.getEtaConsigliata());
        }
    }

    public void mostraVendite() {
        System.out.println("Vendite:");
        for (Vendita vendita : vendite) {
            System.out.println("ID Vendita: " + vendita.getId() +
                    ", Cliente: " + vendita.getCliente().getNome() +
                    ", Giocattolo: " + vendita.getGiocattolo().getNome());
        }
    }

    public static void main(String[] args) {
        NegozioGiocattoli negozio = new NegozioGiocattoli();

        Giocattolo giocattolo1 = new Giocattolo(1, "Lego", 19.99, 6);
        Giocattolo giocattolo2 = new Giocattolo(2, "Gormiti", 14.99, 5);
        negozio.aggiungiGiocattolo(giocattolo1);
        negozio.aggiungiGiocattolo(giocattolo2);

        Cliente cliente1 = new Cliente(1, "Mario Rossi", "mario@email.com");
        Cliente cliente2 = new Cliente(2, "Luigi Bianchi", "luigi@email.com");
        negozio.aggiungiCliente(cliente1);
        negozio.aggiungiCliente(cliente2);

        negozio.registraVendita(1, 1, 1);
        negozio.registraVendita(2, 2, 2);

        negozio.mostraInventario();
        negozio.mostraVendite();
    }
}