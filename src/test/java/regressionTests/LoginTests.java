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
//        dashboardPage = new DashboardPage(driver);
    }

    @AfterEach
    public void tearDown() {

        driver.quit();}

    @Test
    public void verifyThatUserIsAbleToSearchInAdminPage(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        loginPage.getUserName().sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//        String textName=dashboardPage.textDashboard;
//        Assertions.assertEquals("Dashboard",textName);

    }

    @Test
    public void verifyThatUserIsNotAbleToSearchInAdminPage(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.findElement(By.xpath(loginPage.inputUsername)).sendKeys("Adm");
        driver.findElement(By.xpath(loginPage.inputPassword)).sendKeys("adn123");
        driver.findElement(By.xpath(loginPage.buttonLogin)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String textName=driver.findElement(By.xpath("//p[text()=\"Invalid Credentials\"]")).getText();
        Assertions.assertEquals("Invalid Credentials",textName);

    }

}
