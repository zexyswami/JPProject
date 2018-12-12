/**
 * @author Zechariah Dominguez date: 09/29/2018
 * Driver class to test the MoviePlayer class constructor
 */

class DriverMovie {
    public static void main(String[] args){
        MultimediaControl moviePlayer = new MoviePlayer ( "DVD", new Screen("720x480",40,22),MonitorType.LED );
        MultimediaControl moviePlayer2 = new MoviePlayer ( "Blu-Ray", new Screen("1024x768",60,15),MonitorType.LCD );
        System.out.println (moviePlayer);
        System.out.println (moviePlayer2);
    }
}
