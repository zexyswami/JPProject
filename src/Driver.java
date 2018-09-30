//Zechariah Dominguez Date: 09/29/2018
//Driver class for AudioPlayer (Main class)
public class Driver {
    public static void main(String[] args){

        AudioPlayer walkMan = new AudioPlayer("WalkMan", "Analog");

        walkMan.play();

        System.out.print(walkMan.toString());

        AudioPlayer iPod = new AudioPlayer("Ipod", "Digital");

        System.out.print(iPod.toString());
    }
}
