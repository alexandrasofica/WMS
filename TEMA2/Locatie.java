package monitorizare_vreme;

public class Locatie {
    private int idLocatie;
    private String oras;
    private String tara;
    private double latitudine;
    private double longitudine;

    public Locatie(int idLocatie, String oras, String tara, double latitudine, double longitudine) {
        this.idLocatie = idLocatie;
        this.oras = oras;
        this.tara = tara;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public void preiaLocatie() {
        System.out.println("Coordonate preluate: "+oras);
    }
    public void actualizeazaLocatie() {
        System.out.println("Date actualizate.");
    }
    public String getOras() {
        return oras;
    }
}