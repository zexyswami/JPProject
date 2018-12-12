import java.util.Date;

interface Item {
    String MANUFACTURER = "OracleProduction";

    void setProductionNumber(int pNum);

    void setName(String pName);

    String getName();

    Date getManufactureDate();

    int getSerialNumber ();




}

