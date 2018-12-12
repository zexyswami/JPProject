/**
@Author Zechariah Dominguez Date: 09/29/2018
Subclass of product that creates Audio player objects
 and defines Audio player functions like play, stop, previous and next
**/
public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private final ItemType mediaType;
    private MonitorType monitorType;
    private Screen screen;

    /**
     *
     * @param pName - product name
     * @param audioSpecification - the audio format that the player reads. ie: WAV, mp3 etc.
     */
    AudioPlayer(String pName, String audioSpecification) {
        super(pName);
        this.audioSpecification = audioSpecification;
        mediaType = ItemType.AUDIO;
    }

    /**
     *
     * Overloaded constructor
     * @param pName - product name
     * @param monitorType - Type of monitor ie: LED or LCD
     * @param resolution - resolution of the Audio player screen
     * @param refreshRate - the refresh rate of the Audio player screen
     * @param responseTime - the responseTime of the Audio player screen
     */
    AudioPlayer(String pName, MonitorType monitorType, String resolution, int refreshRate, int responseTime){
        super(pName);
        this.monitorType = monitorType;
        this.screen = new Screen(resolution, refreshRate, responseTime);
        mediaType = ItemType.AUDIO;
    }

    //makes the object "play"
    public void play(){
        System.out.println("Im playing");
    }

    //makes the object "stop" playing
    public void stop(){
        System.out.println("I stopped playing");
    }

    //makes the object play the "previous" track
    public void previous(){
        System.out.println("Playing previous track");
    }

    //makes the object play the "next" track
    public void next(){
        System.out.println("playing next");
    }

    /**
     *
     * @return - concatenates a string containing audio spec, media type and monitor type
     * with both toString functions of classes Product and Screen
     */
    public String toString(){
        return super.toString() + String.format("Audio Spec     : %s%nType           : %s%nMonitor Type   : %s%n%s", this.audioSpecification, this.mediaType, this.monitorType, this.screen.toString());
    }
}
