import java.util.ArrayList;
import java.util.Date;


public abstract class Product implements Item, Comparable<Product> {

    private final int serialNumber;

    private static final String manufacturer = Item.MANUFACTURER;

    private final Date manufacturedOn;

    private String name;

    private int currentProductionNumber=1;


    /**
     *
     * @param pName- name of the product
     * product constructor
     */
    Product(String pName){
        this.name = pName;
        this.serialNumber = currentProductionNumber++;
        this.manufacturedOn = new Date();
    }

    /**
     *
     * @param arrayList - an array list that holds object of type T
     * @param c - parent class of object
     * @param <T> - generic to read all types
     * method that prints an array list of type
     * product
     */
    static <T> void printType(ArrayList<T> arrayList, Class c) {
        for (T element: arrayList){
            if (element.getClass() == c)
                System.out.println(element);
        }
    }


    /**
     *
     * @param pNum - product number
     * assigns product number to current production number
     */
    public void setProductionNumber(int pNum){
        this.currentProductionNumber = pNum;
    }

    /**
     *
     * @param pName - product's name
     * assigns product name of object to name variable
     */
    public void setName(String pName) {
        this.name = pName;
    }

    /**
     *
     * @return - returns the name of the manufacturer
     * of product
     */
    public String getManufacturer (){
        return manufacturer;
    }

    /**
     *
     * @return - returns the current date of which the product
     * was created
     */
    public Date getManufactureDate (){
        return (Date)manufacturedOn.clone();
    }

    /**
     *
     * @return - returns the name of the product
     **/
    public String getName (){
        return name;
    }

    /**
     *
     * @return - returns the serial number of product
     */
    public int getSerialNumber (){
        return serialNumber;
    }

    /**
     *
     * @return - returns string of product field variables
     */
    public String toString (){
        return String.format("Manufacturer   : %s%nSerial Number  : %d%nDate           : %s%nName           : %s%n", manufacturer, serialNumber, manufacturedOn.toString(), name);
    }

    /**
     *
     * @param product - object of type product
     * @return - returns a negative or positive number
     * if the given name and name of object are not equal
     * returns 0 if they are
     */
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }

}
