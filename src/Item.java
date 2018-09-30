import java.util.Date;

public interface Item {
    public static final String MANUFACTURER = "OracleProduction";

    void setProductionNumber(int pNum);

    void setName(String pName);

    String getName();

    Date getManufactureDate();

    int getSerialNumber ();




}

