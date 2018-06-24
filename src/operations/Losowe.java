package operations;

import elements.APP_USER;
import elements.APP_USER_ROLES;
import elements.COMPANY;
import elements.JOB;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;


public class Losowe {

    private int no = 0;
    private int noComp = 0;
    Pliki files = new Pliki();
    APP_USER user = new APP_USER();
    APP_USER_ROLES role = new APP_USER_ROLES();
    JOB job = new JOB();
    COMPANY company = new COMPANY();
    Random rnd = new Random();
    ArrayList<String> imiona = new ArrayList<>();
    ArrayList<String> nazwiska = new ArrayList<>();
    ArrayList<String> miasta = new ArrayList<>();
    ArrayList<String> zawody = new ArrayList<>();

    ArrayList<APP_USER> users = new ArrayList<>();
    ArrayList<APP_USER_ROLES> user_roles = new ArrayList<>();
    ArrayList<JOB> jobs = new ArrayList<>();
    ArrayList<COMPANY> companies = new ArrayList<>();


    public void generuj(){

        System.out.println("===GENERATOR REKORDOW===\n\n");

        if(odczytajPliki());
            System.out.println("Odczytano dane");

        if(tworzUserow())
            System.out.println("Wygenerowano Użytkowników");
        if(tworzRole())
            System.out.println("Wygenerowano Role");
        if(tworzFirmy())
            System.out.println("Wygenerowano Firmy");
        if(tworzPrace())
            System.out.println("Wygenerowano Prace");

        System.out.println("\n===ZAPIS DO PLIKU===");

        System.out.println("Zapis ról (5k rekordow)");
        zapiszDoPlikuRole("role.csv");
        System.out.println("Sukces\nZapis prac (50k rekordow)");
        zapiszDoPlikuJobs("jobs.csv");
        System.out.println("Sukces\nZapis firm (100 rekordow)");
        zapiszDoPlikuCompany("company.csv");
        System.out.println("Sukces\nZapis użytkowników (5k rekordów)");
        zapiszDoPlikuUsers("users.csv");
        System.out.println("Sukces");

        System.out.println("=Zapisano dane do pliku=");
        System.out.println("\nKONIEC");

    }

    private Date genNextDate(Date first){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(first);
        calendar.add(Calendar.DAY_OF_MONTH,rnd.nextInt(120)+1);
        Date sqlDate= new java.sql.Date(calendar.getTime().getTime());
        return sqlDate;
    }

    private long genUserID(){
        return (long)rnd.nextInt(4898)+102;
    }

    private long genSalary(){
        return rnd.nextInt(3000)+1500;
    }

    private String genStreet(){
        return "Ulica nr" + String.valueOf(rnd.nextInt(100)+1);
    }

    private String genBudynek(){
        return String.valueOf(rnd.nextInt(100)+1);
    }


    private String genImie(){
        return imiona.get(rnd.nextInt(imiona.size()));
    }

    private String genNazwisko(){
        return nazwiska.get(rnd.nextInt(nazwiska.size()));
    }

    private String genMiasto(){
        return miasta.get(rnd.nextInt(miasta.size()));
    }

    private String genCompanyInfo(){
        return zawody.get(rnd.nextInt(zawody.size()));
    }

    private Date genDateJob(){
        Calendar calendar = new GregorianCalendar(rnd.nextInt(48)+1970, rnd.nextInt(12)+1, rnd.nextInt(28)+1, 9, 0, 0);
        Date sqlDate= new java.sql.Date(calendar.getTime().getTime());
        return sqlDate;
    }

    private Date genDate(){
        Calendar calendar = new GregorianCalendar(rnd.nextInt(40)+1950, rnd.nextInt(12)+1, rnd.nextInt(28)+1, 9, 0, 0);
        Date sqlDate= new java.sql.Date(calendar.getTime().getTime());
        return sqlDate;
    }
    private boolean odczytajPliki(){
        try {
            files.odczyt("E:\\Pobrane\\lab06-07\\generatorRekordowDoBazy\\src\\resources\\imiona.txt",imiona);
            files.odczyt("E:\\Pobrane\\lab06-07\\generatorRekordowDoBazy\\src\\resources\\nazwiska.txt",nazwiska);
            files.odczyt("E:\\Pobrane\\lab06-07\\generatorRekordowDoBazy\\src\\resources\\miasta.txt",miasta);
            files.odczyt("E:\\Pobrane\\lab06-07\\generatorRekordowDoBazy\\src\\resources\\zawody.txt",zawody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public String genPostCode(){
        int front = rnd.nextInt(100);
        int back = rnd.nextInt(1000);
        String postCode;
        if(front>=10)
            postCode=front + "-";
        else
            postCode="0"+front+"-";
        if(back<10)
            postCode+="00"+back;
        if(10<=back && back<100)
            postCode+= "0"+back;
        else
            postCode+=back;

        return postCode;
    }

    private String genNIP(){
        long tmpNIP = 1234000009;
        tmpNIP=tmpNIP + (noComp*10+1);
        noComp++;
        return String.valueOf(tmpNIP);
    }
    private String genREGON(){
        return String.valueOf(rnd.nextInt(1000000000)+100000000);
    }

    private String genFirma(int id){
        return "Firma nr" + id;
    }

    private void zapiszDoPlikuRole(String  nazwa){

        String tresc = "";
        for (APP_USER_ROLES dane:user_roles) {
            tresc+=dane.toString()+ "\n";
        }
        files.zapiszPlik(nazwa,tresc);
    }

    private void zapiszDoPlikuJobs(String nazwa){

        String tresc = "";
        for (JOB dane:jobs) {
            tresc+=dane.toString()+ "\n";
        }
        files.zapiszPlik(nazwa,tresc);
    }

    private void zapiszDoPlikuCompany(String nazwa){

        String tresc = "";
        for (COMPANY dane: companies) {
            tresc+=dane.toString()+ "\n";
        }
        files.zapiszPlik(nazwa,tresc);
    }

    private void zapiszDoPlikuUsers(String nazwa){

        String tresc = "";
        for (APP_USER dane:users) {
            tresc+=dane.toString()+ "\n";
        }
        files.zapiszPlik(nazwa,tresc);
    }

    private boolean tworzRole(){
        int i = 0;
        while(i<5000){
            APP_USER_ROLES a;
            if(i>99) {
                a = new APP_USER_ROLES( i+1 , "USER");
            }
            else {
                a = new APP_USER_ROLES( i+1, "ADMIN");
            }
            user_roles.add(a);
            i++;
        }
        return true;
    }

    private boolean tworzUserow(){
        int i = 0;
        int id;
        while(i<5000){
            APP_USER a;
            id=i+1;
            if(i>99) {
                a = new APP_USER( id ,
                        genBudynek(),
                        genMiasto(),
                        "Polska",
                        genPostCode(),
                        genStreet(),
                        genDate(),
                        genImie(),
                        "password",
                        genNazwisko(),
                        String.valueOf(id),
                        (long)id);
            }
            else {
                a = new APP_USER( id ,
                        genBudynek(),
                        genMiasto(),
                        "Polska",
                        genPostCode(),
                        genStreet(),
                        genDate(),
                        genImie(),
                        "password",
                        genNazwisko(),
                        String.valueOf(id),
                        (long)rnd.nextInt(100)+1);
            }
            users.add(a);
            i++;
        }
        return true;
    }

    private boolean tworzFirmy(){
        int i = 0;
        int id;
        while(i<100){
            id=i+1;
            COMPANY a = new COMPANY( (long)id ,
                    genBudynek(),
                    genMiasto(),
                    "Polska",
                    genPostCode(),
                    genStreet(),
                    genFirma(id),
                    genNIP(),
                    genREGON(),
                    (long)id);

            companies.add(a);
            i++;
        }
        return true;
    }

    private boolean tworzPrace(){
        int i = 0;
        int id;
        Date date;
        while(i<50000){
            id=i+1;
            date = genDateJob();
            JOB a = new JOB(
                    (long)id,
                    genCompanyInfo(),
                    date,
                    genSalary(),
                    genNextDate(date),
                    genUserID());

            jobs.add(a);
            i++;
        }
        return true;
    }
}
