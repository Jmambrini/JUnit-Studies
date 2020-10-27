import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TestGoogle {

    @Test
    public void teste(){
        System.setProperty("webdriver.chrome.driver", "/home/joao/Idea/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        Assert.assertEquals("Google", driver.getTitle());

    }
}