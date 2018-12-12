/**
 @Author Zechariah Dominguez Date: 09/29/2018
 Interface that declares functions necessary for
 products with screens
 **/
interface ScreenSpec {

    String getResolution();

    int getRefreshRate();

    int getResponseTime();
}
