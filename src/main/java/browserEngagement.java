import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Desktop;
import java.net.URI;


public class browserEngagement {
    public static WebDriver driver;

    public static void main(String[] args) throws Exception {
//        Desktop desk = Desktop.getDesktop();
//        desk.browse(new URI("https://www.example.com"));

        driver = new ChromeDriver();
        driver.get("https://www.example.com");

        System.out.println(driver.getTitle());
    }
}
