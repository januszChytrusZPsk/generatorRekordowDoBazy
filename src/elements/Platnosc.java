package elements;

import java.util.Date;

public class Platnosc {
    private long idTypuPlatnosci;
    private Date dataWykonania;
    private String sposob;

    public Platnosc(long idTypuPlatnosci, Date dataWykonania, String sposob) {
        this.idTypuPlatnosci = idTypuPlatnosci;
        this.dataWykonania = dataWykonania;
        this.sposob = sposob;
    }

    public long getIdTypuPlatnosci() {
        return idTypuPlatnosci;
    }

    public void setIdTypuPlatnosci(long idTypuPlatnosci) {
        this.idTypuPlatnosci = idTypuPlatnosci;
    }

    public Date getDataWykonania() {
        return dataWykonania;
    }

    public void setDataWykonania(Date dataWykonania) {
        this.dataWykonania = dataWykonania;
    }

    public String getSposob() {
        return sposob;
    }

    public void setSposob(String sposob) {
        this.sposob = sposob;
    }

    @Override
    public String toString() {
        return idTypuPlatnosci + ";" + dataWykonania + ";" + sposob;
    }
}
