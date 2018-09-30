//Zechariah Dominguez Date: 09/29/2018
//enum that holds Constant device types

public enum ItemType {
    AU ("Audio"), VI ("Visual"), AM ("AudioMobile"), VM ("VisualMobile");

    private String type;

    ItemType(String spec){
        this.type = spec;
    }

    public String getType(){
        return this.type;
    }
}
