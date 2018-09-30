//Zechariah Dominguez Date: 09/29/2018
//Subclass of product that gives more details to the type of player
public class AudioPlayer extends Product implements MultimediaControl {
    String audioSpecification;
    ItemType mediaType;

    //object constructor
    public AudioPlayer(String pName, String audioSpecification) {
        super(pName);
        this.audioSpecification = audioSpecification;
        mediaType.getType();
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

    //returns the toString method from parent class and concatenates new string for Audio specs and Device Type
    public String toString(){
        return super.toString() + String.format("Audio Spec  : %s%nType  : %n", this.audioSpecification);
    }
}
