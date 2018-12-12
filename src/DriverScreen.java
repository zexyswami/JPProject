/**
 * @author Zechariah Dominguez date: 09/29/2018
 * Driver class to test the Screen class constructor
 */
public class DriverScreen {
    public static void main (String[] args){
        Screen lcd = new Screen();
        Screen led = new Screen();
        System.out.println ( lcd );
        System.out.println ( led );
    }
}
