import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class down_photo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://photo.163.com");
        driver.findElement(By.partialLinkText("了解更多")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.cssSelector("#J-iphone")).click();

    }
}
