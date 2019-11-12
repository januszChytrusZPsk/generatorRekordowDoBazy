package operations;

import elements.*;

import java.io.IOException;
import java.sql.Date;
import java.util.*;


public class Losowe {

    private Pliki files = new Pliki();

    private Random rnd = new Random();

    private ArrayList<String> typyPlatnosci = new ArrayList<>();

    private ArrayList<Platnosc> platnosci = new ArrayList<>();
    private ArrayList<Towar> towary = new ArrayList<>();


    public void generuj(){

        System.out.println("===GENERATOR REKORDOW===\n\n");

        if(odczytajPliki())
            System.out.println("Odczytano dane");
        if(generujPlatnosc())
            System.out.println("Wygenerowano Platnosc");
        if(generujTowar())
            System.out.println("Wygenerowano Towary");

        System.out.println("\n===ZAPIS DO PLIKU===");

        System.out.println("Zapis platnosci (5k rekordów)");
        zapiszDoPlikuPlatnosci();
        System.out.println("Zapis towary (50 rekordów)");
        zapiszDoPlikuTowary();

        System.out.println("=Zapisano dane do pliku=");
        System.out.println("\nKONIEC");

    }

    private Date genDate(){
        Calendar calendar = new GregorianCalendar(rnd.nextInt(5)+2013, rnd.nextInt(12)+1, rnd.nextInt(28)+1, 9, 0, 0);
        return new Date(calendar.getTime().getTime());
    }
    private boolean odczytajPliki(){
        try {
            files.odczyt("C:\\Users\\mateu\\Desktop\\platnosci.txt",typyPlatnosci);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private void zapiszDoPlikuPlatnosci(){

        StringBuilder tresc = new StringBuilder();
        tresc.append("id_typu_platnosci;data_wykonania;sposob\n");
        for (Platnosc dane: platnosci) {
            tresc.append(dane.toString()).append("\n");
        }
        files.zapiszPlik("platnosci.csv", tresc.toString());
    }

    private void zapiszDoPlikuTowary(){

        StringBuilder tresc = new StringBuilder();
        tresc.append("id_towaru;producent;nazwa;opis;model;cena;id_typu\n");
        for (Towar dane: towary) {
            tresc.append(dane.toString()).append("\n");
        }
        files.zapiszPlik("towary.csv", tresc.toString());
    }

    private boolean generujPlatnosc() {
        int iloscTypowPlatnosci = typyPlatnosci.size();
        Random gen = new Random();

        for (int i = 1; i <= 5000; i++) {
            Platnosc platnosc = new Platnosc(i, genDate(), typyPlatnosci.get(gen.nextInt(iloscTypowPlatnosci)));
            platnosci.add(platnosc);
        }

        return true;
    }

    private boolean generujTowar() {
        int iloscTypowPlatnosci = typyPlatnosci.size();
        Random gen = new Random();

        for (int i = 0; i < 50; i++) {
            Towar towar = new Towar((i + 1), "producent", "nazwa", "opis", "model", 2000, (i + 10));
            towary.add(towar);
        }

        return true;
    }

}
