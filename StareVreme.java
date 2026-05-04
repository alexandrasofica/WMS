package monitorizare_vreme;
import java.util.Date;

public class StareVreme {
    private int idStare;
    private float temperatura;
    private float umiditate;
    private float precipitatii;
    private float presiune;
    private float punctRoua;
    private Date dataOra;
    private Locatie locatie;
    private BazeDeDate bazaDeDate;
    private ActualizareTimpReal actualizare;
    private AnalizaSaptamanala analiza;
    private PredictieViitoare predictie;
    private Utilizator vizualizatDe;

    public StareVreme(int idStare, float temperatura, float umiditate, float precipitatii, float presiune, float punctRoua, Locatie loc) {
        this.idStare = idStare;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
        this.precipitatii = precipitatii;
        this.presiune = presiune;
        this.punctRoua = punctRoua;
        this.locatie = loc;
        this.dataOra = new Date();
    }

    public void citesteDate() {
        System.out.println("Citire date.");
    }
    public void afiseazaStareVreme() {
        System.out.println("Temperatura: " + temperatura);
    }
    public float calculeazaIndiceConfort() {
        return temperatura + (umiditate / 10);
    }
    public boolean detecteazaVremeRea() {
        return temperatura > 35 || temperatura < -15;
    }
}