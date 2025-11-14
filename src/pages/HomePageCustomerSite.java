package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class HomePageCustomerSite extends Driver {

    By loginCredentialLocator = By.xpath("//input[@class = 'login loginElem']");
    By loginPasswordLocator = By.xpath("//input[@class = 'password loginElem']");
    By signInButtonLocator = By.xpath("//input[@id = 'signInButton']");

    public String getURL(){
        System.out.println("Sunt in getURL method!");
        String URLPaginaPrincipala = driver.getCurrentUrl();
        return URLPaginaPrincipala;
    }

    public void insertTheCredential(){
        WebElement loginCredential = driver.findElement(loginCredentialLocator);
        loginCredential.sendKeys("IQ5DVT");
    }

    public void insertThePassword(){
        WebElement loginPassword = driver.findElement(loginPasswordLocator);
        loginPassword.sendKeys("Test@12345");
    }

    public void signIn(){
        WebElement signIn = driver.findElement(signInButtonLocator);
        signIn.click();
    }



}
