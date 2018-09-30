//Zechariah Dominguez Date: 09/29/2018
//Class that instantiates products with name, manufacturer, date, and product number

import java.util.Date;

public abstract class Product implements Item {
    private int serialNumber;

    private String manufacturer = Item.MANUFACTURER;

    private Date manufacturerdOn;

    private String name;

    private static int currentProductionNumber=0;

    //object constructor
    public Product(String pName){
        this.name = pName;
        this.serialNumber = currentProductionNumber++;
        this.manufacturerdOn = new Date();
    }

    //setter for field variables
    public void setProductionNumber(int pNum){
        this.currentProductionNumber = pNum;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    //getters for field variables
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

    //returns manufacturer name, serial number, date and product name to caller
    public String toString (){
        return String.format("Manufacturer  : %s%nSerial Number  : %d%nDate  : %s%nName  : %s%n", getManufacturer(), getSerialNumber(), getManufactureDate().toString(), getName());
    }
}
