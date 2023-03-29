package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public String inputUsername="";

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getUserName(){
        return driver.findElement(By.xpath(inputUsername));
    }

    public WebElement getPassword(){
        return driver.findElement(By.xpath(inputPassword));
    }

    public WebElement getLoginButton(){
        return driver.findElement(By.xpath(buttonLogin));
    }

    public WebElement getErrorMessage(){
        return driver.findElement(By.xpath(inputUsername));
    }

    public void waitForElementInSeconds(int seconds){
        
    }

}
