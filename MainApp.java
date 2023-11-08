public class MainApp {
    public static void main(String[] args) {
        Inventario inventario = new Inventario("admin", "password");
        RegistroVendite registro = new RegistroVenditeConcreto();

        inventario.aggiungiGiocattolo(new Giocattolo(1, "Puzzle", 10.99, 8));
        inventario.aggiungiGiocattolo(new Giocattolo(2, "Lego", 19.99, 6));

        InterfacciaUtente interfacciaUtente = new InterfacciaUtente(inventario, registro);

        while (true) {
            interfacciaUtente.mostraMenu();
        }
    }
}
