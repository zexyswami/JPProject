/**
 * @author Zechariah Dominguez date: 09/29/2018
 *
 * Movie player class that holds  the Movie player constructor
 * and defines the Movie player functions like play, stop, previous and next
 */
public class MoviePlayer extends Product implements MultimediaControl {
    private final Screen screen;
    private final MonitorType monitorType;

    /**
     *
     * @param pName - product name
     * @param screen - Screen specs of movie player
     * @param monitorType - Type of monitor ie: LED or LCD
     */
    MoviePlayer(String pName, Screen screen, MonitorType monitorType) {
        super ( pName );
        this.monitorType = monitorType;
        this.screen = screen;
    }


    //makes the object "play"
    public void play(){
        System.out.println("Im playing");
    }

    //makes the object "stop"
    public void stop(){
        System.out.println("I stopped playing");
    }

    //makes the object "previous track"
    public void previous(){
        System.out.println("Playing previous track");
    }

    //makes the object "next track"
    public void next(){
        System.out.println("playing next");
    }

    /**
     *
     * @return - returns a string output of Screen specs and monitor type
     */
    public String toString(){
        return super.toString () + String.format ( "Screen%10s %s%nMonitor " +
                "Type%4s %s", ":", screen, ":", monitorType);
    }

}
