package lippia.web.constants;

import org.openqa.selenium.WebDriver;

public class BasicConstants {

    public static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }
    public static void setDriver(WebDriver driver1){
        driver = driver1;
    }

}
