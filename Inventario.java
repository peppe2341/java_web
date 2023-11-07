import java.util.List;
import java.util.ArrayList;


class Inventario {
    private List<Giocattolo> inventario;
    private String adminUsername;
    private String adminPassword;

    public Inventario(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.inventario = new ArrayList<>();
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo) {
        inventario.add(giocattolo);
    }

    public void rimuoviGiocattolo(int id) {
        inventario.removeIf(giocattolo -> giocattolo.getId() == id);
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

    public boolean autenticazioneAdmin(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}
