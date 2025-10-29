package utils;

import java.util.concurrent.TimeUnit;

import static utils.Driver.driver;

public class Waits {
    public void waiting(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
