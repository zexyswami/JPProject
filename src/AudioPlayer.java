import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl {
    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer(String pName, String audioSpecification) {
        super(pName);
        this.audioSpecification = audioSpecification;
        mediaType.getType();
    }

    public void play(){
        System.out.println("Im playing");
    }

    public void stop(){
        System.out.println("I stopped playing");
    }

    public void previous(){
        System.out.println("Playing previous track");
    }

    public void next(){
        System.out.println("playing next");
    }

    public String toString(){
        return super.toString() + String.format("Audio Spec  : %s%nType  : %n", this.audioSpecification);
    }
}
