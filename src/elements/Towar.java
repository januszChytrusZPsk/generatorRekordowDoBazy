package elements;

public class Towar {
    private long idTowaru;
    private String producent;
    private String nazwa;
    private String opis;
    private String model;
    private long cena;
    private long idTypu;

    public Towar(long idTowaru, String producent, String nazwa, String opis, String model, long cena, long idTypu) {
        this.idTowaru = idTowaru;
        this.producent = producent;
        this.nazwa = nazwa;
        this.opis = opis;
        this.model = model;
        this.cena = cena;
        this.idTypu = idTypu;
    }

    public long getIdTowaru() {
        return idTowaru;
    }

    public void setIdTowaru(long idTowaru) {
        this.idTowaru = idTowaru;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getCena() {
        return cena;
    }

    public void setCena(long cena) {
        this.cena = cena;
    }

    public long getIdTypu() {
        return idTypu;
    }

    public void setIdTypu(long idTypu) {
        this.idTypu = idTypu;
    }

    @Override
    public String toString() {
        return idTowaru + ";" + producent + ";" + nazwa + ";" + opis + ";" + model + ";" + cena + ";" + idTypu;
    }
}
