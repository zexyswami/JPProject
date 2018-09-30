public class Driver {
    public static void main(String[] args){
        AudioPlayer walkMan = new AudioPlayer("WalkMan", "Analog");
        walkMan.play();
        System.out.print(walkMan.toString());
        AudioPlayer iPod = new AudioPlayer("Ipod", "Digital");
        System.out.print(iPod.toString());
    }
}
