package elements;

import java.sql.Date;

public class APP_USER {
    private long ID;
    private String BUILDING;
    private String CITY;
    private String COUNTRY;
    private String POSTCODE;
    private String STREET;
    private Date DATE_OF_BIRTH;
    private String NAME;
    private String PASSWORD = "password";
    private String SURNAME;
    private String USERNAME;
    private long CURRENT_COMPANY_ID;

    public APP_USER() {
    }

    public APP_USER(long ID, String BUILDING,
                    String CITY, String COUNTRY,
                    String POSTCODE, String STREET,
                    Date DATE_OF_BIRTH, String NAME,
                    String PASSWORD, String SURNAME,
                    String USERNAME, Long CURRENT_COMPANY_ID){
        this.ID = ID;
        this.BUILDING = BUILDING;
        this.CITY = CITY;
        this.COUNTRY = COUNTRY;
        this.POSTCODE = POSTCODE;
        this.STREET = STREET;
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
        this.NAME = NAME;
        this.PASSWORD = PASSWORD;
        this.SURNAME = SURNAME;
        this.USERNAME = USERNAME;
        this.CURRENT_COMPANY_ID = CURRENT_COMPANY_ID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getBUILDING() {
        return BUILDING;
    }

    public void setBUILDING(String BUILDING) {
        this.BUILDING = BUILDING;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getPOSTCODE() {
        return POSTCODE;
    }

    public void setPOSTCODE(String POSTCODE) {
        this.POSTCODE = POSTCODE;
    }

    public String getSTREET() {
        return STREET;
    }

    public void setSTREET(String STREET) {
        this.STREET = STREET;
    }

    public Date getDATE_OF_BIRTH() {
        return DATE_OF_BIRTH;
    }

    public void setDATE_OF_BIRTH(Date DATE_OF_BIRTH) {
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public void setSURNAME(String SURNAME) {
        this.SURNAME = SURNAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public long getCURRENT_COMPANY_ID() {
        return CURRENT_COMPANY_ID;
    }

    public void setCURRENT_COMPANY_ID(long CURRENT_COMPANY_ID) {
        this.CURRENT_COMPANY_ID = CURRENT_COMPANY_ID;
    }

    @Override
    public String toString(){
        return ID + ",\"" +
                "" + BUILDING + "\",\"" +
                "" + CITY + "\",\"" +
                "" + COUNTRY + "\",\"" +
                "" + POSTCODE + "\",\"" +
                "" + STREET + "\",\"" +
                "" + DATE_OF_BIRTH + "\",\"" +
                "" + NAME + "\",\"" +
                "" + PASSWORD + "\",\"" +
                "" + SURNAME + "\",\"" +
                "" + USERNAME + "\"," +
                "" + CURRENT_COMPANY_ID;
    }
}
