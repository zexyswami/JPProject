/**
 * @author Zechariah Dominguez date: 09/29/2018
 * Driver class to test both MoviePlayer and AudioPlayer class's constructor
 */
public class DriverAudioMovie {
    public static void main(String[] args){
        MultimediaControl audioPlayer = new AudioPlayer ( "Walkman","Analog" );
        MultimediaControl audioPlayer1 = new AudioPlayer ( "Zune","Digital" );
        MultimediaControl moviePlayer = new MoviePlayer ( "DVD",new Screen("720x480",40,22) ,MonitorType.LED );
        audioPlayer.play();
        moviePlayer.stop();
        System.out.println ( audioPlayer );
        System.out.println ( audioPlayer1 );
        System.out.println ( moviePlayer );
    }
}
