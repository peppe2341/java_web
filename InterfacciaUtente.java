import java.util.Scanner;

public class InterfacciaUtente {

    private Inventario inventario;
    private RegistroVendite registro;

    public InterfacciaUtente(Inventario inventario, RegistroVendite registro) {
        this.inventario = inventario;
        this.registro = registro;
    }

    public void mostraMenu() {
        System.out.println("Benvenuto nel programma di gestione giocattoli!");
        System.out.println("1. Acquista giocattolo");
        System.out.println("2. Visualizza vendite");
        System.out.println("3. Esci");

        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                acquistaGiocattolo();
                break;
            case 2:
                visualizzaVendite();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                mostraMenu();
                break;
        }
    }

    private void acquistaGiocattolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'ID del giocattolo che vuoi acquistare: ");
        int idGiocattolo = scanner.nextInt();

        Giocattolo giocattolo = inventario.trovaGiocattolo(idGiocattolo);

        if (giocattolo != null) {
            System.out.print("Inserisci il tuo ID: ");
            int idCliente = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Inserisci il tuo nome: ");
            String nomeCliente = scanner.nextLine();
            System.out.print("Inserisci il tuo email: ");
            String emailCliente = scanner.nextLine();

            Cliente cliente = new Cliente(idCliente, nomeCliente, emailCliente);

            registro.registraVendita(idGiocattolo, cliente, giocattolo);
            System.out.println("Vendita registrata con successo!");
        } else {
            System.out.println("Giocattolo non trovato nell'inventario.");
        }
    }

    private void visualizzaVendite() {
        System.out.println("Vendite:");
        for (Vendita vendita : registro.getVendite()) {
            System.out.println("ID vendita: " + vendita.getId() +
                    ", Nome cliente: " + vendita.getCliente().getNome() +
                    ", Nome giocattolo: " + vendita.getGiocattolo().getNome() +
                    ", Prezzo: " + vendita.getGiocattolo().getPrezzo());
        }
    }
}