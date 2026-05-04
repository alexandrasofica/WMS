package monitorizare_vreme;
import java.util.ArrayList;
import java.util.List;

public class Utilizator {
    private int idUtilizator;
    private String nume;
    private String email;
    private String parola;

    private List<Locatie> locatiiAlese; // Agregare
    private ReprezentareGrafica grafic; // Asociere
    private AnalizaSaptamanala analiza; // Asociere

    public Utilizator(int idUtilizator, String nume, String email, String parola) {
        this.idUtilizator = idUtilizator;
        this.nume = nume;
        this.email = email;
        this.parola = parola;
        this.locatiiAlese = new ArrayList<>();
    }

    public boolean autentificare() {
        return true;
    }
    public void adaugaLocatie(Locatie loc) {
        this.locatiiAlese.add(loc);
    }
    public void primesteAlerta(Alerta alerta) {
        alerta.afiseazaAlerta();
    }
    public String getNume() {
        return nume;
    }

    public void vizualizeazaStareVreme() {
        System.out.println("Vizualizare meteo.");
    }
    public void vizualizeazaGrafic() {
        System.out.println("Vizualizare grafic.");
    }
    public void vizualizeazaPredictie() {
        System.out.println("Vizualizare predictie.");
    }
    public void vizualizeazaAnalizaSaptamanala() {
        System.out.println("Vizualizare analiza.");
    }
}