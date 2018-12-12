/**
*@author Zechariah Dominguez Date: 09/29/2018
*Driver class to test Audio player constructor
*/
class DriverAudio {
    public static void main(String[] args){

        MultimediaControl audioPlayer = new AudioPlayer ("Pyle PDV156BK", MonitorType.LED, "1366x768", 40,22);
        MultimediaControl audioPlayer1 = new AudioPlayer ("Ipod", MonitorType.LCD, "320x240", 30,12);

        System.out.println (audioPlayer);
        System.out.println (audioPlayer1);
    }
}
