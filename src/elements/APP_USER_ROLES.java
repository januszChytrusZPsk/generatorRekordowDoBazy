package elements;

public class APP_USER_ROLES {
    private long APP_USER_ID;
    private String ROLES;

    public APP_USER_ROLES(){

    }

    public APP_USER_ROLES(long APP_USER_ID, String ROLES) {
        this.APP_USER_ID = APP_USER_ID;
        this.ROLES = ROLES;
    }

    public long getAPP_USER_ID() {
        return APP_USER_ID;
    }

    public void setAPP_USER_ID(long APP_USER_ID) {
        this.APP_USER_ID = APP_USER_ID;
    }

    public String getROLES() {
        return ROLES;
    }

    public void setROLES(String ROLES) {
        this.ROLES = ROLES;
    }

    @Override
    public String toString() {
        return APP_USER_ID +
                ",\"" + ROLES + "\"";
    }
}
