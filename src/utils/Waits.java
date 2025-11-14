package utils;

import java.util.concurrent.TimeUnit;

import static utils.Driver.driver;

public class Waits {
     public void asteptare (){
         try{
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
