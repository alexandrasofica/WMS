package monitorizare_vreme;

public class Main {
    public static void main(String[] args) {
        Locatie loc = new Locatie(1, "Oradea", "Romania", 47.05, 21.93);
        Utilizator utilizator = new Utilizator(10, "Ana", "ana03@mail.com", "ana123");
        utilizator.autentificare();
        utilizator.adaugaLocatie(loc);

        StareVreme stare = new StareVreme(101, 38.5f, 45.0f, 12.5f, 1013.2f, 15.0f, loc);
        stare.citesteDate();
        stare.afiseazaStareVreme();

        Alerta alertaCanicula = new Alerta(500, "Cod Rosu", "Ramaneti in casa! Canicula extrema.", "Ridicat", loc, utilizator);

        if (alertaCanicula.verificaConditiiAlerta(stare)) {
            alertaCanicula.genereazaAlerta();
            utilizator.primesteAlerta(alertaCanicula);
        }

        utilizator.vizualizeazaGrafic();
        System.out.println("\nPornire!");
    }
}