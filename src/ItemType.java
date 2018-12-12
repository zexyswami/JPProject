/**
 @Author Zechariah Dominguez Date: 09/29/2018
 Enum that holds constant values for the type of Product
 **/

public enum ItemType {
    AUDIO ("AU"), VISUAL ("VI"), AUDIOMOBILE ("AM"), VISUALMOBILE ("VM");

    private final String type;

    ItemType(String spec){
        this.type = spec;
    }

    public String getType(){
        return this.type;
    }
}
