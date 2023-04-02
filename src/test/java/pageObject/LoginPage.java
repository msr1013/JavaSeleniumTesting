package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public String inputUsername = "//input[@placeholder=\"Username\"]";
    public String inputPassword = "//input[@name=\"password\"]";
    public String buttonLogin = "//button[text()=\" Login \"]";
    public String textInvalidCredit = "//p[text()=\"Invalid credentials\"]";

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
        return driver.findElement(By.xpath(textInvalidCredit));
    }

    public void waitForElementInSeconds(int seconds){
        
    }

    public void loginToApplication (String username,String password){
        getUserName().sendKeys("Admin");
        getPassword().sendKeys("admin123");
        getLoginButton().click();
        waitForElementInSeconds(5);
    }

    public void verifyErrorMessageInLoginPage(String expectedMessage){
        String textName = getErrorMessage().getText();
        Assertions.assertEquals(expectedMessage,textName);
    }

}
