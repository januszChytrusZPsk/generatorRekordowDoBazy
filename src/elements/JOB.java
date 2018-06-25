package elements;

import java.sql.Date;

public class JOB {
    private long ID;
    private String COMPANY_INFO;
    private Date FROM_DATE;
    private long SALARY;
    private Date TO_DATE;
    private long APP_USER_ID;

    public JOB() {
    }

    public JOB(long ID, String COMPANY_INFO, Date FROM_DATE, long SALARY, Date TO_DATE, long APP_USER_ID) {
        this.ID = ID;
        this.COMPANY_INFO = COMPANY_INFO;
        this.FROM_DATE = FROM_DATE;
        this.SALARY = SALARY;
        this.TO_DATE = TO_DATE;
        this.APP_USER_ID = APP_USER_ID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getCOMPANY_INFO() {
        return COMPANY_INFO;
    }

    public void setCOMPANY_INFO(String COMPANY_INFO) {
        this.COMPANY_INFO = COMPANY_INFO;
    }

    public Date getFROM_DATE() {
        return FROM_DATE;
    }

    public void setFROM_DATE(Date FROM_DATE) {
        this.FROM_DATE = FROM_DATE;
    }

    public long getSALARY() {
        return SALARY;
    }

    public void setSALARY(long SALARY) {
        this.SALARY = SALARY;
    }

    public Date getTO_DATE() {
        return TO_DATE;
    }

    public void setTO_DATE(Date TO_DATE) {
        this.TO_DATE = TO_DATE;
    }

    public long getAPP_USER_ID() {
        return APP_USER_ID;
    }

    public void setAPP_USER_ID(long APP_USER_ID) {
        this.APP_USER_ID = APP_USER_ID;
    }

    @Override
    public String toString() {
        return  ID +
                "," + COMPANY_INFO +
                "," + FROM_DATE +
                "," + SALARY +
                "," + TO_DATE +
                "," + APP_USER_ID;
    }
}
