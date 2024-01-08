package HomeExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoGlobalTravelExam {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testMethod1() {
        driver.get("https://www.example.com");

        WebElement userEl = driver.findElement(By.name("username"));
        WebElement passEl = driver.findElement(By.name("password"));

        userEl.sendKeys("testuser");
        passEl.sendKeys("testpass");

        driver.findElement(By.name("Login")).click();

       String actualTitle = driver.getTitle();
       String expectedTitle = "Welcome - Example.";

        Assert.assertEquals(actualTitle, expectedTitle);



    }




    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
