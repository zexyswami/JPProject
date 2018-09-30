import sun.security.x509.SerialNumber;

import java.util.Date;

public abstract class Product implements Item {
    private int serialNumber;

    private String manufacturer = Item.MANUFACTURER;

    private Date manufacturerdOn;

    private String name;

    private static int currentProductionNumber=0;

    public Product(String pName){
        this.name = pName;
        this.serialNumber = currentProductionNumber++;
        this.manufacturerdOn = new Date();
    }

    public void setProductionNumber(int pNum){
        this.currentProductionNumber = pNum;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public String getManufacturer (){
        return manufacturer;
    }

    public Date getManufactureDate (){
        return manufacturerdOn;
    }

    public String getName (){
        return name;
    }

    public int getSerialNumber (){
        return serialNumber;
    }

    public String toString (){
        return String.format("Manufacturer  : %s%nSerial Number  : %d%nDate  : %s%nName  : %s%n", getManufacturer(), getSerialNumber(), getManufactureDate().toString(), getName());
    }
}
