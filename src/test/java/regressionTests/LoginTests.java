package regressionTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.DashboardPage;
import pageObject.LoginPage;

import java.time.Duration;

public class LoginTests {
    private WebDriver driver;
    private LoginPage loginPage;
//    private DashboardPage dashboardPage;

    @BeforeEach
    public void setUp() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32man\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);

    }

    @AfterEach
    public void tearDown() {

        driver.quit();}

    @Test
    public void verifyThatUserIsAbleToSearchInAdminPage(){

        loginPage.loginToApplication("Admin","admin123");

    }

    @Test
    public void verifyThatUserIsNotAbleToSearchInAdminPage(){

        loginPage.loginToApplication("Admin","admin1sdfs23");
        loginPage.verifyErrorMessageInLoginPage("Password is Invalid");

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
