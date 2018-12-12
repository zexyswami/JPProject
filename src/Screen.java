/**
 @Author Zechariah Dominguez Date: 09/29/2018
 Screen class the defines the essentials needed for
 any product with a screen and allows objects to be
 created without screens
 **/
public class Screen implements ScreenSpec {
    private String resolution;
    private int refreshRate;
    private int responseTime;
//Constructor
    Screen(){}
//Loaded constructor
    Screen(String resolution, int refreshRate, int responseTime){
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    /**
     *
     * @return - returns resolution of the screen
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     *
     * @return - returns the refresh rate of the screen
     */
    public int getRefreshRate() {
        return this.refreshRate;
    }

    /**
     *
     * @return - returns the response time of the screen
     */
    public int getResponseTime() {
        return this.responseTime;
    }

    /**
     *
     * @return - returns a string, listing all field variables of screen object
     */
    public String toString() {
        return String.format("Resolution     : %s%nRefresh Rate   : %s%nResponse Time  : %s", this.resolution, this.refreshRate, this.responseTime);
    }
}

