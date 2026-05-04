package monitorizare_vreme;
import java.util.Date;

public class Alerta {
    private int idAlerta;
    private String tipAlerta;
    private String mesaj;
    private String nivelPericol;
    private Date dataEmitare;

    private Locatie zona;
    private Utilizator destinatar;

    public Alerta(int idAlerta, String tipAlerta, String mesaj, String nivelPericol, Locatie zona, Utilizator user) {
        this.idAlerta = idAlerta;
        this.tipAlerta = tipAlerta;
        this.mesaj = mesaj;
        this.nivelPericol = nivelPericol;
        this.zona = zona;
        this.destinatar = user;
        this.dataEmitare = new Date();
    }

    public void genereazaAlerta() {
        System.out.println("Alerta generata.");
    }
    public void trimiteAlerta() {
        System.out.println("Notificare trimisa.");
    }
    public void afiseazaAlerta() {
        System.out.println("Atentie!" + mesaj);
    }

    public boolean verificaConditiiAlerta(StareVreme stare) {
        return stare.detecteazaVremeRea();
    }
}