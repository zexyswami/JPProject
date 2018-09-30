//Zechariah Dominguez Date: 09/29/2018
//Interface that declares Constants and methods used to get and set implemented object variables

import java.util.Date;

public interface Item {
    String MANUFACTURER = "OracleProduction";

    void setProductionNumber(int pNum);

    void setName(String pName);

    String getName();

    Date getManufactureDate();

    int getSerialNumber ();




}

