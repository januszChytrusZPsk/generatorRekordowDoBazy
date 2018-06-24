package elements;

public class COMPANY {
    private long COMPANYID;
    private String BUILDING;
    private String CITY;
    private String COUNTRY;
    private String POSTCODE;
    private String STREET;
    private String COMPANY_NAME;
    private String NIP;
    private String REGON;
    private long OWNER_ID;


    public COMPANY() {
    }

    public COMPANY(long COMPANYID, String BUILDING, String CITY, String COUNTRY, String POSTCODE, String STREET, String COMPANY_NAME, String NIP, String REGON, long OWNER_ID) {
        this.COMPANYID = COMPANYID;
        this.BUILDING = BUILDING;
        this.CITY = CITY;
        this.COUNTRY = COUNTRY;
        this.POSTCODE = POSTCODE;
        this.STREET = STREET;
        this.COMPANY_NAME = COMPANY_NAME;
        this.NIP = NIP;
        this.REGON = REGON;
        this.OWNER_ID =OWNER_ID;
    }

    public long getOWNER_ID() {
        return OWNER_ID;
    }

    public void setOWNER_ID(long OWNER_ID) {
        this.OWNER_ID = OWNER_ID;
    }


    public long getCOMPANYID() {
        return COMPANYID;
    }

    public void setCOMPANYID(long COMPANYID) {
        this.COMPANYID = COMPANYID;
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

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

    @Override
    public String toString() {
        return  COMPANYID +
                ",\"" + BUILDING + "\"," +
                ",\"" + CITY + "\"" +
                ",\"" + COUNTRY + "\"" +
                ",\"" + POSTCODE + "\"" +
                ",\"" + STREET + "\"" +
                ",\"" + COMPANY_NAME + "\"" +
                ",\"" + NIP + "\"" +
                ",\"" + REGON + "\"" +
                "," + OWNER_ID;
    }
}
